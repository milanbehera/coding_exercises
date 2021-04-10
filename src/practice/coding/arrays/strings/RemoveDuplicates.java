package practice.coding.arrays.strings;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        for(int i=0; i< nums.length -1; i++) {
            if(nums[i] == nums[i+1]) {
                if(nums.length > i+2) {
                    nums[i+1] = nums[i+2];
                } else {
                    nums[i+1] = -1;
                }

            }
        }

        int length = nums.length;
        return length;
    }



    public static void main(String[] s) {
        int[] num =  new int[] {1,1,2};
        removeDuplicates(num);
        for(int i=0; i< num.length; i ++) {
            System.out.print(i);
        }
    }
}
