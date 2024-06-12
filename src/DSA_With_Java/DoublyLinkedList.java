package DSA_With_Java;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;

        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);//create new node
        if(length == 0){// or "head == null"
            /*If the linked list is empty, reference variables "head" and "tail"
            * will point to the newly created Node. */
            head = newNode;
            tail =  newNode;
        } else {
            tail.next = newNode; //next pointer of tail will point to  newNode
            newNode.prev = tail; //prev pointer on newNode points to the same Node tail is pointng to.
            tail = newNode; //tail ref var now points to newNode and adds newNode to the DLL
        }
        length++;
    }

    public Node removeLast(){
        /*Edge Cases:
        * 1) Empty Linked List
        * 2) One item in the Linked List
        * 3) Two or more items in Linked List*/
        if(length == 0) return null; /*Edge Case #1 */
        Node temp = tail; //temp points to tail
            /*Edge case #2*/
        if(length == 1){
            head = null;
            tail = null;
        } else {
            /*Edge Case #3*/
            tail = tail.prev; //tail move one over to the previous Node
            tail.next = null; //break off from next (last) node
            temp.prev = null; //break off from previous (next to last) Node
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        /*Edge cases:
        * 1) Empty Linked List
        * 2) One or more items in Linked List*/
        Node newNode = new Node(value);
        if(length == 0){
            /*Edge Case #1*/
            head = newNode;
            tail = newNode;
        }else{
            /*Edge Case #2*/
            newNode.next = head; /* next pointer of newNode points to the head pointer which points to the first Node of the linked list*/
            head.prev = newNode; /*prev pointer of first Node in linked list set to point to the newNode to be inserted */
            head = newNode; /*head pointer set to point to the newNode. head pointer is "moved" over to the newNode. newNode is not added to the DLL at the beginning of the DLL*/
        }
        length++;
    }

    public Node removeFirst(){
        /*Edge Cases:
        * 1) Empty Linked List
        * 2) One item in Linked List
        * 3) Multiple items in Linked List
        * */
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        } else{
            head = head.next; //move head pointer one node to the right
            head.prev = null; //disconnects Node head is pointing to from previous (first) Node
            temp.next = null; //disconnects Node temp is pointing to (the first node) from next Node
                                // which head is now pointing to
        }
        length--; //decrement the Linked List
        return temp; //return the pointer to the Node that was removed.
    }

    public Node get(int index){
        if(index <0 || index >= length) return null; //we cannot retrieve a Node whose index is out of bounds of the DLL
        Node temp =  head; //create a temp ref var to point to the head Node of the DLL
        if(index < length/2) {
            /*Forward iterating for-loop*/
            for (int i = 0; i < index; i++) {
                temp = temp.next; //we move temp ref var forward
            }
        }else {
            temp = tail; //set temp ref var to point to the tail Node of the DLL
            /*Rearward iterating for-loop*/
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev; //temp moves rearward
            }
        }
        return temp;
    }
}
