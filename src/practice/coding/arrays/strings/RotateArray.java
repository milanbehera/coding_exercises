package practice.coding.arrays.strings;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int subLength = length -k ;
        int index = 0;
        int[] tmp = new int[length];

        for(int i= subLength ; i < length ; i++) {
            tmp[index] = nums[i];
            index ++;
        }

        for(int z=0; z < length -k; z ++) {
            tmp[index] = nums[z];
            index ++;
        }

        for(int x=0; x<length; x++) {
            nums[x] = tmp[x];
        }
    }

    public static void main(String[] s) {
        int [] arr = new int[] {1,2,3,4,5,6,7};

        rotate(arr, 3);

    }
}
