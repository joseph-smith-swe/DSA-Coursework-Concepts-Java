package DSA_With_Java.Data_Structures.General_DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
//    public static int[] twoSum(int[] nums, int target){
//        HashMap<Integer, Integer> myHM = new HashMap<>();
//        for (int i = 0; i < nums.length;i++ ){
//            int complement = target - nums[i];
//
//            if(myHM.containsKey(complement)){
//                return new int[] {myHM.get(complement), i};
//            }
//            myHM.put(nums[i],i);
//        }
//        return nums;
//    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length;i++ ){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[] {i,complementIndex};
            }
            complements.put(target - nums[i],i);
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

}
