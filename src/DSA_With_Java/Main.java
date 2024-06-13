package DSA_With_Java;

//import DSA_With_Java.LinkedList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println("////////////////Linked List///////////");
//        LinkedList myLL = new LinkedList(2);
//        LinkedList myLL = new LinkedList(0);
//        System.out.println(myLL);//Here we get only a memory address

//        myLL.getHead();
//        myLL.getTail();
//        myLL.getLength();
//        myLL.printList();
//
//        myLL.append(3);
//        myLL.append(1);
//        myLL.prepend(1);
//        myLL.printList();
//        System.out.println("/////////Returns from removeLast() method invocations///////////");
//        //(2) Items -Returns 2 Nodes
//        System.out.println(myLL.removeLast().value);
//        // (1) Item -Returns 1 Node
//        System.out.println(myLL.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLL.removeLast());

//        System.out.println("////Returns from removeFirst()////");
//        //(2) Items - Return 2 Node
//        System.out.println(myLL.removeFirst().value);
//        //(1) Item - Returns 1 Node
//        System.out.println(myLL.removeFirst().value);
//        //(0) Items - Returns null
//        System.out.println(myLL.removeFirst());

        System.out.println("///////Spacer/////////////");
//        LinkedList myLL = new LinkedList(0);
//        System.out.println("///////Returns from get() method//////" +"\n");
//        myLL.append(1);
//        myLL.append(2);
//        myLL.append(3);
//        System.out.println("The returned node from the get() method: "+ myLL.get(2).value);
//        myLL.printList();

        System.out.println("//////////////myLL2///////////////////");
        LinkedList myLL2 = new LinkedList(11);
        myLL2.append(3);
        myLL2.append(23);
        myLL2.append(7);
        myLL2.setV2(3,4);  //"3" will change to "4"
//        System.out.println(myLL2.setV2(-1,4));
//        myLL2.set(1,5);
        myLL2.printList();

        System.out.println("//////////////////myLL3////////////////");
        LinkedList myLL3 = new LinkedList(0);
        myLL3.append(2);
        myLL3.append(3);
        myLL3.insert(2,1);
        myLL3.printList();
        System.out.println("////////////myLL4/////////////");

        LinkedList myLL4 = new LinkedList(11);
        myLL4.append(3);
        myLL4.append(23);
        myLL4.append(7);
//        myLL4.remove(2);
        myLL4.printList();

        System.out.println("/////////////myLL5 - Reverse the Linked List");
        LinkedList myLL5 = new LinkedList(1);
        myLL5.append(2);
        myLL5.append(3);
        myLL5.append(4);
        myLL5.printList();
        System.out.println("The reversed list: ");
        myLL5.reverse();
        myLL5.printList();

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