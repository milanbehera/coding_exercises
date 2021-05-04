package practice.coding.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairOfSocks {

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0; i <n; i++) {
            if(count.containsKey(ar[i])  ) {
                    pairs +=1;
                    count.remove(ar[i]);
            } else {
                count.put(ar[i] , 1 );
            }
        }
        return pairs;
    }

    public static void main(String s[]) {
        int [] arr = new int [] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        System.out.println(sockMerchant(n,arr));
    }
}
