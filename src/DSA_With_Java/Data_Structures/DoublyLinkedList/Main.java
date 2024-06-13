package DSA_With_Java.Data_Structures.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("/////////////////myDLL1////////////////////");
        DoublyLinkedList myDLL1 = new DoublyLinkedList(7);
        System.out.println("/////myDLL1 get methods invoked///////////////");
        myDLL1.getHead();
        myDLL1.getTail();
        myDLL1.getLength();
        myDLL1.printList();

        System.out.println("/////////////myDLL2-removeLast()///////////////////");
        DoublyLinkedList myDll2 = new DoublyLinkedList(1);
        myDll2.append(2);
        System.out.println("Before removeLast() invoked: ");
        myDll2.printList();
        System.out.println("After removeLast() invoked: ");

        //(2) Items - Returns 2 Node
        System.out.println(myDll2.removeLast().value);
        //(1) Item -Returns 1 Node
        System.out.println(myDll2.removeLast().value);
        //(0) Items -Returns null
        System.out.println(myDll2.removeLast());
        //myDll2.printLIst();

        System.out.println("/////////////myDLL3-prepend()///////////////////");
        DoublyLinkedList myDLL3 = new DoublyLinkedList(2);
        myDLL3.append(3);
        System.out.println("Before prepend: ");
        myDLL3.printList();
        System.out.println("After prepend: ");
        myDLL3.prepend(1);
        myDLL3.printList();

        System.out.println("//////////////////myDLL4-removeFirst()///////////");
        DoublyLinkedList myDLL4 = new DoublyLinkedList(2);
        myDLL4.append(1);

        myDLL4.printList();

        System.out.println("///////removeFirst() invocations/////////");
        //(2) Items - Return 2 Node
        System.out.println(myDLL4.removeFirst().value);
        //(1) Item - Return 1 Node
        System.out.println(myDLL4.removeFirst().value);
        //(0) Items -Returns null
        System.out.println(myDLL4.removeFirst());
        //myDLL4.printList();

        System.out.println("///////////myDLL5- get()/////////////");
        DoublyLinkedList myDLL5 = new DoublyLinkedList(0);
        myDLL5.append(1);
        myDLL5.append(2);
        myDLL5.append(3);
        myDLL5.printList();

        System.out.println("//////////myDLL5- get() invoked//////////////");
        System.out.println(myDLL5.get(1).value);
        System.out.println(myDLL5.get(2).value + "\n");
        System.out.println("//////////Original myDLL5 nodes are unchanged///////////");
        myDLL5.printList();

        System.out.println("/////////////myDLL6- set()/////////////");
        DoublyLinkedList myDLL6 = new DoublyLinkedList(11);
        myDLL6.append(3);
        myDLL6.append(23);
        myDLL6.append(7);

        myDLL6.printList();

        System.out.println("//////////myDLL6 - set() invoked////////////");
        myDLL6.set(1,4);
        myDLL6.printList();

        System.out.println("//////////myDLL7 - insert() ////////////");
        DoublyLinkedList myDLL7 = new DoublyLinkedList(1);
        myDLL7.append(3);
        myDLL7.printList();
        System.out.println("//////////myDLL7 - insert() invoked ////////////");
        myDLL7.insert(1,2);
        myDLL7.printList();

        System.out.println("//////////myDLL8 - remove()////////////////////");
        DoublyLinkedList myDLL8 = new DoublyLinkedList(0);
        myDLL8.append(1);
        myDLL8.append(2);
        myDLL8.printList();

        System.out.println("//////////myDLL8 - remove() invoked// ////////////");
        myDLL8.remove(1);
        myDLL8.printList();
    }
}
