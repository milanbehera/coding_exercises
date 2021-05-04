package practice.coding.arrays;

import java.util.*;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer,Integer> count = new HashMap<>();
        Integer maxLen = candles.get(0);
        for(int i = 0; i< candles.size(); i++) {
            if(candles.get(i) >= maxLen) {
                maxLen = candles.get(i);
                count.put(maxLen,count.getOrDefault(maxLen,0)+1);
            }
        }
       return count.get(maxLen);
    }

    public static void main(String [] s) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(4,2,3,4));
        System.out.println(birthdayCakeCandles(candles));
    }
}
