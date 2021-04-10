package practice.coding.strings;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        if(str.length() == 0) return "";
        int [] currentLongest = {0,1};
        int [] oddLongest;
        int [] evenLongest;
        int [] longest;
        for(int i = 1; i < str.length(); i++) {
            oddLongest = getLongestPalindrome(str, i-1, i+1);
            evenLongest = getLongestPalindrome(str, i-1, i);
            longest = getLongest(oddLongest,evenLongest);
            currentLongest = getLongest(currentLongest,longest);
        }
        return str.substring(currentLongest[0],currentLongest[1]);
    }

    public static int [] getLongestPalindrome(String str, int i, int j) {
        while(i >=0 && j < str.length()) {
            if(str.charAt(i) != str.charAt(j))
                break;
            i = i -1;
            j = j+1;
        }
        return new int[] {i+1,j};
    }

    private static int[] getLongest(int[] one, int [] two) {
        int firstArraySize = one[1] - one [0];
        int secondArraySize = two[1] - two[0];

        if(firstArraySize > secondArraySize) {
            return one;
        } else {
            return two;
        }

    }

    public static void main(String s[]) {
        System.out.print(longestPalindromicSubstring("noon high it is"));
    }
}
