package practice.coding.arrays;

public class MaxSumSubArrayOfSizeK {

    /*
    Given an array of positive numbers and a positive number ‘k,’
    find the maximum sum of any contiguous subarray of size ‘k’.
    Input: [2, 1, 5, 1, 3, 2], k=3
    Output: 9
    Explanation: Subarray with maximum sum is [5, 1, 3].
     */

    public static int calculateMaxSum(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;
        int start = 0;

        for(int end = 0; end < arr.length ; end++) {
            windowSum += arr[end];
            if(end >=k-1) {
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= arr[start];
                start++;
            }

        }
        return maxSum;
    }

    public static void main(String [] s) {
        System.out.print(calculateMaxSum(new int[] {2, 1, 5, 1, 3, 2}, 3));
    }
}
