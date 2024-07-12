package DSA_With_Java.Data_Structures.HashTable;

public class HashTable {
    private int size = 7;
    private Node[] dataMap; //type Node, so a pointer to a Node. An array of pointers to Nodes.

    class Node{
        String key;
        int value;
        Node next; //next, as always,will point to a Node

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(){
        dataMap = new Node[size]; //we instantiate the array of the variable size
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i+ ":");
            Node temp = dataMap[i];
            while (temp != null){
                System.out.println("  {" + temp.key + "=" +temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash = 0;
        //toCharArray() will take the key and make it an array of characters
        char[] keyChars = key.toCharArray(); //Take the key and put it into a char array
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            //multiplying by a prime number makes it more random.
            //This equation will always return a number that is one of the indexes in this array.
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        //we go through the for-loop for each character
        // and return hash which always be a number between zero and six due to the hash equation.
        return hash;
    }

    public void set(String key, int value){
        //we need to determine the index where the ke-value pair will go.
        int index = hash(key);
        //we create the Node
        Node newNode = new Node(key,value);
        //Edge case: Inserting a Node into an empty linked list.
        //if dataMap at the particular index is equal to null,
        //then we set dataMap at that index to be set to newNode
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else{
            //temp is a ref var we are going to use to iterate over this LinkedList
            Node temp = dataMap[index]; //We are pointing temp at the first Node
            while(temp.next != null){
                temp = temp.next; //This moves the temp pointer over
            }
            temp.next = newNode; //newNode added to the linked list
        }
    }

    public int get(String key){
        /*We return an int which is the value associated with the key in the parameter*/
        int index = hash(key); // get the index for the key parameter
        Node temp = dataMap[index]; //temp ref var pointed to the first Node
        while(temp!= null){
            if(temp.key == key) return temp.value;
            temp = temp.next; //move temp ref var forward if the key does not match
        }
        return 0;

    }
}
