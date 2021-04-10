package practice.coding.arrays;

public class LongestIncreasingSubsequence {

    private static int findLIS(int [] nums) {
        int [] lis = new int[nums.length];
        for(int i=0; i< lis.length; i++) {
            lis[i] = 1;
        }

        int MAX_SEQ = 1;

        for(int i=1; i< nums.length; i++) {
            lis[i] =1;
            for(int j=0; j<i; j++) {
                if(nums[i] > nums[j] &&
                lis[i] < lis[j] +1) {
                    lis[i] = 1+lis[j];
                    if(lis[i] > MAX_SEQ){
                        MAX_SEQ = lis[i];
                        //System.out.print(MAX_SEQ);
                    }


                }
            }
        }
        return MAX_SEQ;
    }

    public static void main(String[] s) {
        int [] arr = new int[] {5,8,7,1,9};
        int lis = findLIS(arr);
        System.out.print(lis);
    }
}


