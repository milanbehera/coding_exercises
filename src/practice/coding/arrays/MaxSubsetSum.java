package practice.coding.arrays;

import org.junit.Test;

import java.util.Arrays;

public class MaxSubsetSum {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int i = array.length;
        int sum = 0;
        while(i> 1) {
            sum =+ array[i];
            i = i-2;
        }
        return sum;
    }


}
