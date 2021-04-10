package practice.coding.arrays.strings;

public class Palindrome {

    static boolean checkPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean checkPalindrome1(String str) {
        boolean isPallindrome = false;
        int i = 0;
        int j = str.length() - 1;
        while(i <= j) {
            if(str.charAt(i) == str.charAt(j))
                isPallindrome = true;
            i += 1;
            j -= 1;
        }
        return isPallindrome;
    }

    public static void main(String[] s) {
        System.out.print(checkPalindrome("abb"));
    }
}
