package practice.coding.arrays;

public class MaxAreaContainer {

    public static int maxArea(int[] height) {
        int max = 0;
        int tempMax = 0;
        int i =0;
        int len = height.length -1;
        while(i < len) {
            if(height[i] > height[len]) {
                 tempMax = height[len] *(len - i);
                len --;
            } else {
                tempMax = height[i] *(len - i);
                i++;
            }
            if (tempMax > max) max = tempMax;
        }

        return max;
    }

    public static void main(String s []) {
        int [] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
