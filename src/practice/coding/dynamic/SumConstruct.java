package practice.coding.dynamic;

import java.util.HashMap;
import java.util.Map;

public class SumConstruct {

    public static int sumConstruct(String target, String[] wordBank, Map<String,Integer> memo) {
        if(memo.containsKey(target))
            return memo.get(target);
        if(target.equals(null) || target.isEmpty())
            return 1;
        int retVal = 0;
        for(String word: wordBank) {
            if(target.indexOf(word) == 0){
                int numways = sumConstruct(target.substring(word.length()),wordBank,memo);
                    retVal += numways;
            }
        }
        memo.put(target,retVal);
        return retVal;
    }

    public static void main(String [] s) {
        Map<String,Integer> memo = new HashMap<>();
        System.out.println(sumConstruct("abcdef", new String[] {"ab","abc","cd","def","abcd"},memo));

        //System.out.println(sumConstruct("eeeeeeeeeeeeeeeeeeeeeeff", new String[] {"e","ee","eee","eeee","eeeee"},memo));

       // System.out.println(sumConstruct("skateboard", new String[] {"ska","ate","bo","ord"},memo));
    }
}
