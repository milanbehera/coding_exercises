package practice.coding.arrays;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int [] range = {-1,-1};
        if(nums.length > 1) {
            int rangeIndex = 0;
            for(int i=0; i< nums.length; i++) {
                if(nums[i] == target) {
                    range[rangeIndex] = i;
                    rangeIndex += 1;
                }

            }
            if(rangeIndex >= 1) {

            }
        } else if(nums.length == 1 && nums[0] == target) {
            return new int[]{0,0};
        }

        return range;
    }

    public static void main(String[] s) {
        int[] nums = new int[] {1,4};
        int[] range = searchRange(nums,4);
        System.out.print(range.length);
    }
}
