package practice.coding.arrays;

import java.util.*;

public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length <= 0) {
            return new ArrayList<>();
        }
        Map<String,List<String>> kvp = new HashMap<>();
        for(String s :strs) {
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            if(!kvp.containsKey(String.valueOf(chars))) {
                kvp.put(String.valueOf(chars),new ArrayList<>());
            }
            kvp.get(String.valueOf(chars)).add(s);
        }
        return new ArrayList<>(kvp.values());

    }
}
