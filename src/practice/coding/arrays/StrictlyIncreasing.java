package practice.coding.arrays;

public class StrictlyIncreasing {

    boolean almostIncreasingSequence(int[] sequence) {
        boolean almostIncreasing = true;
        for (int i=0; i< sequence.length -1; i++) {
            if(!(almostIncreasing && sequence[i] <= sequence[i+1])) {
                almostIncreasing =false;
            }
        }
        return almostIncreasing;
    }
}
