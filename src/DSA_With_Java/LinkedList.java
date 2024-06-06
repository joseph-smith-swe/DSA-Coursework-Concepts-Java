package DSA_With_Java;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value  = value;
        }
    }

    public LinkedList(int value){
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
        System.out.println("Head:" + head.value);
    }
    public void getTail(){
        System.out.println("Tail:" + tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void append(int value){
        Node newNode =  new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail =  newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0 ){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre =  temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next =  null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0/* head == null will also work here */){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head =  newNode;
        }
        length++;
    }

    public Node removeFirst(){
        /*Edge cases:
         * 1)Multiple items in the linked list
         * 2)One item in the linked list
         * 3)Zero items present in the linked list
         * */
        if(length ==0 )//check if our linked list is empty
        {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null; //remove the first node
        length--; //we decrement the length by one
        if(length == 0){
            tail = null;
        }
        return temp; //Temp is the pointer to the node was removed.
    }

    public Node get (int index){

        if(index < 0 || index >= length){ //check to see that we are not out of the bounds of the LinkedList
            return null;
        }
        Node temp = head; //the pointer of type node

        for (int i = 0; i < index; i++) {
            temp = temp.next; //we move the pointer forward //loop with stop "i" is no longer less than the index. So, on the "index" parameter

        }
        return temp;
    }

    public boolean set(int index, int value){
        /*We set the node with a particular value at a particular index*/
        Node temp = get(index); //we used the get() method above
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean setV2(int index, int value){
        /*We set the node with a particular value at a particular index*/
        if(index < 0 || index >= length){ //check to see that we are not out of the bounds of the LinkedList
            return false;
        }
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
            temp.value = value;
            return true;

    }

}

