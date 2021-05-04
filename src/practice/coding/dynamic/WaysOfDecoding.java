package practice.coding.dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WaysOfDecoding {

    public static int decode(String s) {
        //int count = 0;
        Set<Integer> count = new HashSet<>();
        char[] arr = s.toCharArray();
        if(arr.length == 1 ){
            if(Character.getNumericValue(arr[0]) == 0) {
                return 0;
            } else {
                return 1;
            }
        }

        for(int i=0; i< arr.length - 1; i++) {
            if(Character.getNumericValue(arr[i] )!= 0) {
                if(Character.getNumericValue(arr[i]) <= 26) {
                    count.add(Character.getNumericValue(arr[i]));
                }

                if(Character.getNumericValue(arr[i]+arr[i+1]) <= 26) {
                    count.add(Character.getNumericValue(arr[i]+arr[i+1]));
                }
            }
        }

        return count.size();
    }

    public static void main(String [] s) {
        System.out.print(decode("1"));
    }
}
