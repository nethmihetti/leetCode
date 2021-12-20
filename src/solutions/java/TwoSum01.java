package solutions.java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum01 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        result[0] = i;
                        result[1] = j;
                        System.out.println(result[0] + ", " + result[1]);
                        return result;
                    }
                }
            }
        }

        return result;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
           // if (nums[i] <= target) {
                int dif = target - nums[i];
                System.out.println("map.get(dif): " + map.get(dif));
                System.out.println("dif: " + dif);
                if(map.get(dif) != null && map.get(dif) != i) {
                    result[0] = i;
                    result[1] = map.get(dif) ;
                    System.out.println(result[0] + ", " + result[1]);
                    return result;
                }
                map.put(nums[i], i);
           // }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        twoSumOptimized(nums, 0);
        //System.out.println();
    }
}
