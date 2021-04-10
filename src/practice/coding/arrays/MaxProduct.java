package practice.coding.arrays;

public class MaxProduct {

   static int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0; i < inputArray.length -1; i++) {
            if(inputArray[i] *inputArray[i+1] > maxProduct)
                    maxProduct = inputArray[i] *inputArray[i+1];
        }
        return maxProduct;

    }

    public static void main(String [] s) {

    }
}
