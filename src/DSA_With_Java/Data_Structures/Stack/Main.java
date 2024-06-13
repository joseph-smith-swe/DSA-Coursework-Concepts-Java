package DSA_With_Java.Data_Structures.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("/////////////myStack - test//////////");
        Stack myStack = new Stack(4);
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        System.out.println("/////////////myStack1 //////////");
        Stack myStack1 = new Stack(2);
        myStack1.printStack();
        System.out.println("/////////////myStack1 - push()//////////");
        myStack1.push(1);
        myStack1.printStack();

        System.out.println("///////////myStack2//////////////");
        Stack myStack2 = new Stack(7);
        myStack2.push(23);
        myStack2.push(3);
        myStack2.push(11);
        myStack2.printStack();
        System.out.println("///////////myStack2- pop() invoked//////////////");
        myStack2.pop();
        myStack2.printStack();
    }
}
