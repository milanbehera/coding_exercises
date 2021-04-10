package practice.coding.arrays;

import org.junit.Test;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] combined = new int[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne, 0, combined, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, combined, arrayOne.length, arrayTwo.length);
        Arrays.sort(combined);
        int i = 0;


        return new int[] {};
    }

    @Test
    public void test_smallest_Difference() {
        int[] arr1 = {-1,5,10,20,28,3};
        int[] arr2 = {26,134,135,15,17};
        smallestDifference(arr1,arr2);
    }
}
