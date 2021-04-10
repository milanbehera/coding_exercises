package practice.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    public static boolean canGenerateDocument(String characters, String document) {
        int charLength = characters.length();
        int docLength = document.length();
        boolean isPossible = true;
        if(charLength == 0 && docLength == 0)
            return false;

        Map<Character,Integer> charMap = new HashMap<>();

        for(int i = 0; i < charLength; i++) {
            if(charMap.containsKey(characters.charAt(i))) {
                int counter = charMap.get(characters.charAt(i)) + 1;
                charMap.put(characters.charAt(i), counter);
            } else {
                charMap.put(characters.charAt(i), 1);
            }
        }

        for(int i= 0; i < docLength; i++) {
            if(charMap.containsKey(document.charAt(i))) {
                int counter = charMap.get(document.charAt(i)) ;
                if(counter > 0) {
                    charMap.put(document.charAt(i), counter - 1);
                } else {
                    isPossible = false;
                }

            } else {
                return false;
            }
        }
        return isPossible;
    }

    public static void main(String s []) {
        String characters = "aheaolabbhb";
        String document= "hello";
        System.out.print(canGenerateDocument(characters ,document));
    }
}
