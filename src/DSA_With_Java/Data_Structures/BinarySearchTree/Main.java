package DSA_With_Java.Data_Structures.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("////////BST Functionality Test////////////////");
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("root = " + myBST.root);

        System.out.println("////////////////////myBST1////////////////////");
        BinarySearchTree myBST1 = new BinarySearchTree();
        myBST1.insert(47);
        myBST1.insert(21);
        myBST1.insert(76);
        myBST1.insert(18);
        myBST1.insert(52);
        myBST1.insert(82);

        myBST1.insert(27);

        //We test to ensure the Node with value 27 was inserted in the correct place
        System.out.println(myBST1.root.left.right.value);

        System.out.println("//////////myBST2 - contains() invoked///////////////");
        BinarySearchTree myBST2 = new BinarySearchTree();
        myBST2.insert(47);
        myBST2.insert(21);
        myBST2.insert(76);
        myBST2.insert(18);
        myBST2.insert(27);
        myBST2.insert(52);
        myBST2.insert(82);

        System.out.println(myBST2.contains(27));
        System.out.println(myBST2.contains(17));
    }
}
