package practice.coding.arrays;

import java.math.BigDecimal;

public class PlusMinusPercentage {

    static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float neutral = 0;
        int total = arr.length;

        for(int i = 0; i<  total; i++) {
            if(arr[i] > 0) {
                positive++;
            } else if ( arr[i] < 0) {
                negative ++;
            } else {
                neutral ++;
            }
        }

        System.out.println("positive percentage:"+ String.format("{0:0.000000}",positive/total));
        System.out.println("negative percentage:"+ negative/total);
        System.out.println("neutral percentage:"+ neutral/total);

    }

    public static void main(String [] s) {
        int [] arr = new int[]{-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}
