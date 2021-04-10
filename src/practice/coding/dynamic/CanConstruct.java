package practice.coding.dynamic;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

    public static boolean canConstruct(String target, String[] wordBank, Map<String,Boolean> memo) {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target.equals(null) || target.isEmpty())
            return true;
            for(String word: wordBank) {
                if(target.indexOf(word) == 0){
                    String suffix = target.substring(word.length());
                    if(canConstruct(suffix,wordBank,memo) == true) {
                        memo.put(target,true);
                        return true;
                    }
                }
            }
            memo.put(target,false);
            return false;
    }

    public static void main(String [] s) {
        Map<String,Boolean> memo = new HashMap<>();
        System.out.println(canConstruct("abcdef", new String[] {"ab","abc","cd","def","abcd"},memo));

        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeff", new String[] {"e","ee","eee","eeee","eeeee"},memo));

        System.out.println(canConstruct("skateboard", new String[] {"ska","ate","bo","ord"},memo));
    }
}
