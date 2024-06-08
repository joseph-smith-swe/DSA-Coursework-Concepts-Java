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
        /*The pointer to the Node that was removed is returned*/
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

    public boolean insert(int index, int value){
       /*Here we insert a new Node with of a particular value at a particular index*/
       if(index <0 || index > length){
           //we cannot insert before index 0 OR
           // if index is greater than the length of the array
           //in other words, if the next is out of range
           return false;
       }
       if(index == 0){
           /*we use the prepend method to insert at the front of the linked list
           if the index is 0, we use the prepend method*/
           prepend(value);
           /*Prepend has a return type of void and not boolean, so we cannot put Prepend()
           * in the return statement of insert(). We must explicitly make a return statement
           * that returns a boolean. In this case, it is true.*/
           return true;
       }
       if(index == length){
           append(value);
           return true;
       }
       Node newNode = new Node(value);
       Node temp = get(index-1);
       newNode.next = temp.next;
       /*We make the newNode pointer point to the temp pointer which
       * is already pointing to the Node of the index that was passed
       * as a parameter into this method
        */
       temp.next = newNode;
       /*Because newNode now points to the next Node in the sequence via its ".next" field
        * and we set temp.next to point to newNode, newNode
        * is inserted into the Linked List*/
       length++;
       //increase the length by 1 because we added to the node
       return true;
    }

    public Node remove(int index){
        /*We remove a node at a particular index and return the pointer to that node*/
        if(index < 0 || index >= length){
            /*We cannot remove and index that is out of range
            Remove() has a return type of Node. If we are not returning a Node,
            * then we return null*/
            return null;
        }
        if(index == 0){
            /*removeFirst() has a return type of Node just like the remove() method.
            * Because of this, we can use removeFirst() in a return statement.*/
            return removeFirst();
        }
        if(index == length-1){
            /*removeLast() has a return type of Node
            * so we can use it here inside the return statement.*/
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next; //This is a O(1) operation instead of using get() with is an O(n) operation.

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        /*We are reversing the linked list in place. This is not a reversed duplicate.*/
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before; //this flips the pointer temp.next to reverse
            before = temp;
            temp = after;

        }
    }


}

