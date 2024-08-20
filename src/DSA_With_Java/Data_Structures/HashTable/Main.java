package DSA_With_Java.Data_Structures.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();
        myHT.printTable();

        System.out.println("//////////////////myHT2////////////////////");
        HashTable myHT2 = new HashTable();
        myHT2.set("nails", 100);
        myHT2.set("tile", 50);
        myHT2.set("lumber", 80);
        myHT2.set("bolts", 200);
        myHT2.set("screws", 140);

        myHT2.printTable();

        System.out.println("//////////////////myHT3////////////////////");
        HashTable myHT3 = new HashTable();
        myHT3.set("nails", 100);
        myHT3.set("tile", 50);
        myHT3.set("lumber", 80);

        myHT3.printTable();
        System.out.println(myHT3.get("lumber"));
        System.out.println(myHT3.get("bolts"));

        System.out.println("//////////////////myHT4////////////////////");
        HashTable myHT4 = new HashTable();
        myHT4.set("paint", 20);
        myHT4.set("bolts", 40);
        myHT4.set("nails", 100);
        myHT4.set("tile", 50);
        myHT4.set("lumber", 80);

//        myHT4.printTable();

        //This will print out the ArrayList that the keys() returnss
        System.out.println(myHT4.keys());
    }
}
