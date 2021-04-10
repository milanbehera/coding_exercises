package practice.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string) {
        int len = string.length();
        if(len == 0)
            return -1;
        Map<Character,Integer> characterMap = new HashMap<>();

        for(int i = 0; i < len; i++) {
            if(characterMap.containsKey(string.charAt(i))) {
                int increment = characterMap.get(string.charAt(i)) + 1;
                characterMap.put(string.charAt(i),increment);
            } else {
                characterMap.put(string.charAt(i),1);
            }
        }

        for(int i = 0; i < len; i++) {
            if(characterMap.get(string.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String s[]) {
        String str = "";
        System.out.print(firstNonRepeatingCharacter(str));
    }
}
