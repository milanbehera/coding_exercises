package practice.coding.arrays;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        int nonConstructibleChange = 0;
        Arrays.sort(coins);

        for(int i=0; i<coins.length; i++) {
            if(coins [i] > nonConstructibleChange +1) {
                return nonConstructibleChange + 1;
            }
            nonConstructibleChange += coins[i];
        }

        return nonConstructibleChange + 1;

    }
}
