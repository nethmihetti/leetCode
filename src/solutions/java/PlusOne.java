package solutions.java;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder("");
        for (int digit : digits) {
            sb.append(digit);
        }

        //  int numPlusOne = Integer.parseInt(Arrays.toString(digits)) + 1;
       // BigInteger numPlusOne = Integer.parseInt(sb.toString()) + 1;
        BigInteger numPlusOne = BigInteger.valueOf(Integer.parseInt(sb.toString())).add(BigInteger.ONE);
        System.out.println(numPlusOne);
        System.out.println("lll");
        String numAsString = String.valueOf(numPlusOne);
        int size = numAsString.length();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = numAsString.charAt(i) - '0';
        }

        for (int j : result) {
            System.out.print(j + ", ");
        }
        return result;
    }

/*    public static int plusOneImproved(int[] digits) {
        int newSize = digits.length;
        int[] result = new int[newSize];
        for (int i = digits.length-1; i >=0; i--) {

        }
    }*/

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        plusOne(arr);
    }
}
