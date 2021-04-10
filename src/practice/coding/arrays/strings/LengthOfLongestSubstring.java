package practice.coding.arrays.strings;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int anchor = 0;
        int result = 0;
        char[] arr = s.toCharArray();

        for(int i=0; i < s.length() -1; i++) {
            if(arr[i] != arr[i+1]) {
               result =  Math.max(result ,i - anchor+1);
            } else {
                anchor = i;
            }
        }
        return result;
    }
}
