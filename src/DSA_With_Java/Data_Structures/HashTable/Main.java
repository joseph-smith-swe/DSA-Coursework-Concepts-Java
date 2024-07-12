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
    }
}
