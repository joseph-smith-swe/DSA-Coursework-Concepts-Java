package DSA_With_Java;

public class Stack {
    /*We create a stack with a linked list implementation*/
    private Node top;
    private int height; //aka. length

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode; //top ref var points to the newly created Node
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        }else{
            newNode.next = top; //next pointer of newNode points to the same Node that the top pointer is pointing to
            top = newNode;  //top pointer "moved" to point to tne newNode
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;
        Node temp = top;//we return a Node so we need a var that points to it.
        top = top.next; //move the top pointer down to the next Node in the stack
        temp.next = null; //unlink Node from the stack
        height--;
        return temp;
    }

}
