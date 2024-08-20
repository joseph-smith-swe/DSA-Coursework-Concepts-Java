package DSA_With_Java.Data_Structures.misc.interviewHashTable;

import java.util.HashMap;

public class Main {
    /*General note, insertion and lookup operations BY KEY in a HashTable is O(1) constant time. */

    /*In this code (itemInCommon()), we find if an item is present within two arrays
    * and return a boolean result. The issue is that this code is inefficient
    * with a Big O of O(n^2).
    * */
    public static boolean itemInCommon(int[] array1, int[] array2){
        for (int i: array1){
            for (int j : array2){
                if(i == j) return true;
            }
        }
        return false;
    }

    /*In this code (itemInCommonHT), we used a hashmap that has a Big O
    * of O(n) instead of O(n^2) like a nested for loop.*/
    public static boolean itemInCommonHT(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        //Time Complexity of: O(n)
        for (int i : array1){
            myHashMap.put(i,true);
        }

        //Time Complexity of: O(n)
        for (int j : array2){

            //Check to see if j is in the hashmap as a key. A match will return true.
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,5};

        System.out.println("////Nested For Loop Implementation");
        System.out.println(itemInCommon(array1,array2));
        System.out.println("///HashMap Implementation");
        System.out.println(itemInCommonHT(array1,array2));
    }
}
