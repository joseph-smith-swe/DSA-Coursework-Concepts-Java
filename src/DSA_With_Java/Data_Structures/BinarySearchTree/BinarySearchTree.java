package DSA_With_Java.Data_Structures.BinarySearchTree;

public class BinarySearchTree {

    protected Node root; //root reference variable is not private so we may use it directly in the main class. root will eventually point to a Node

    /*We do not have a constructor for the BinarySearchTree class because we are
    * creating a BST with no Node in it on instantiation. Therefore, root will initially point to null.
    * We shall insert the first Node via the insert() method.*/
    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value); //We use the value argument to create the newNode
        if(root == null){
            root = newNode;
            return true; //in this case, we exit the method and return true because a Node as been inserted
        }
        Node temp = root; //temp pointer initially points to root pointer
        /*Edge Cases:
        * 1. We are inserting a value already in the BST. (No duplicates allowed)
        * 2. If the value of the Node to be inserted is less than the parent Node. We set to the left of the parent Node.
        * 2. If the value of the Node to be inserted is greater than the parent Node. We set to the right of the parent Node.
        * */
        while(true){
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true; // We inserted a Node. We return true.
                }
                temp = temp.left; //The if condition as returned false. Now the temp pointer is "moved" to the Node temp.left is pointing to
            }else {
                if(temp.right == null){
                    temp.right =  newNode;
                    return true;
                }
                temp = temp.right; //The if condition has returned false. This code is executed.
            }

        }

    }


}
