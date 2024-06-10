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

    public void printLIst(){
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
}
