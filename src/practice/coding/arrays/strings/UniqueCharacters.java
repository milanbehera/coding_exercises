package practice.coding.arrays.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//Implement an algo to determine if a string has unique characters.
public class UniqueCharacters {

    public static void main(String[] s) {
        System.out.println(isUnique1("helo"));
        System.out.print(isUnique2("hleol"));

    }

    //Using additional datastructure
    private static boolean isUnique1(String str) {
        Set<Character> characters = new HashSet<>();
        for(char c : str.toCharArray()) {
            characters.add(c);
        }
        if(str.length() == characters.size())
            return true;
        return false;
    }

    //Using no additional datastructure
    private static boolean isUnique2(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        int index = 0;
            while(index != c.length-1) {
                if(c[index] == c[index+1])
                    return false;
                index++;
            }
        return true;
    }
}
