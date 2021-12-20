package solutions.java;

public class PalindromeNumber09 {
    public static boolean isPalindrome(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        System.out.println(arr);
        for(int i=0; i< (arr.length/2 ); i++) {
            System.out.println("i: " + i);
            System.out.println("arr[i]: " + arr[i]);
            System.out.println("arr[arr.length-1-i]: " + arr[arr.length-1-i]);
            if(arr[i] != arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
