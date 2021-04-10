package practice.coding.strings;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for(String word:words) {
            char [] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(map.containsKey(sortedWord)) {
                map.get(sortedWord).add(word);
            } else {
                map.put(sortedWord, new ArrayList<String>( Arrays.asList(word)));
            }
        }

       for(Map.Entry<String, List<String>> entry: map.entrySet()) {
           anagrams.add(entry.getValue());
       }
        return  anagrams;
    }
}
