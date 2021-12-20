package solutions.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsDifference1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        List<List<Integer>> result = new java.util.ArrayList<>(Collections.emptyList());

        for (int i = 0; i < arr.length - 1; i++) {
            int neighborDif = arr[i + 1] - arr[i];
            if (minDif > neighborDif) minDif = neighborDif;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if((arr[i+1] - arr[i]) == minDif) {
                List<Integer> pair = Arrays.asList(arr[i], arr[i+1]);
                result.add(pair);
            }
        }

        for (List<Integer> integers : result) {
            System.out.print(integers.get(0) + ", " + integers.get(1));
            System.out.println();
        }


        return result;
    }

    public static void main(String[] args) {
       int[] arr = {3,8,-10,23,19,-4,-14,27};
       minimumAbsDifference(arr);

    }
}
