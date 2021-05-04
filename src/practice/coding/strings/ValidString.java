package practice.coding.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidString {

    static String isValid(String s) {
        String returnvalue = "YES";
        int count =0;
        Map<Character,Integer> map = new HashMap<>();
        char [] charArr = s.toCharArray();
        for(Character c :charArr) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()) {
            if(entry.getValue() == 2 && count == 0) {
                count ++;
                returnvalue = "NO";
            }
        }



    return returnvalue;
    }

    public static void main(String s[]) {
        String str = "abcdefghhgfedecba";
        System.out.println(isValid(str));
    }
}
