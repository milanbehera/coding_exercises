package practice.coding.dynamic;

public class MaxNonAdjacentSum {

    public static int maxSum(int[] array) {
        int inclusive = array[0];
        int exclusive = 0;
        int tmp;
        for(int i =1; i < array.length; i++) {
            tmp = inclusive;
            inclusive = Math.max(array[i]+exclusive,inclusive);
            exclusive = tmp;
        }
        return inclusive;
    }

    public static void main(String [] s) {
        int[] arr = new int[]{7, 10, 12, 7, 9, 14};
        System.out.print(maxSum(arr));
    }
}
