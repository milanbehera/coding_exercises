package practice.coding.arrays.strings;

import java.util.Arrays;

public class Permutation {

    public static void main(String [] s) {
        System.out.println(isPermutation("god ","dog"));
        System.out.println(isPermutation("boo","dog"));
    }

    private static boolean isPermutation(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        char [] str1Arr = str1.toCharArray();
        Arrays.sort(str1Arr);

        char [] str2Arr = str2.toCharArray();
        Arrays.sort(str2Arr);

        String newStr1 = new String(str1Arr);
        String newStr2 = new String(str2Arr);

        if(newStr1.equals(newStr2))
            return true;
        return false;

    }
}
