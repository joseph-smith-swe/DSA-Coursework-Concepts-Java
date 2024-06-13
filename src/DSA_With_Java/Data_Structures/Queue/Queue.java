package DSA_With_Java.Data_Structures.Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue (int value){
        Node newNode = new Node(value);

        first = newNode;
        last = newNode;
        length = 1;
    }
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getLast(){
        System.out.println("First: " + last.value);
    }

    public void getLength(){
        System.out.println("First: " + length);
    }

    public void enqueue(int value){
        /*Edge Cases:
        * 1) Zero items in the queue
        * 2) One or more items in the queue
        * */
        Node newNode = new Node(value);
        if(length == 0){
            first =  newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        /*Edge Cases:
        * 1) Zero items in the queue
        * 2) One item in the queue
        * 3) Two or more items in the queue*/
        if(length == 0)return null; //or if(first == null)
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else {
            first = first.next; //move first pointer over
            temp.next = null; //unlink Node temp is pointing to
        }
        length--;
        return temp;
    }
}
