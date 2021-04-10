package practice.coding.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqCount = 0;
        int arrCount = 0;
        while (arrCount < array.size() && seqCount < sequence.size()) {
            if (array.get(arrCount) == sequence.get(seqCount)) {
                seqCount++;
            }
            arrCount++;
        }
        return seqCount == sequence.size();
    }

    @Test
   public  void test_sub_sequence() {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> seqList = new ArrayList<>();
        int[] array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = new int[]{22, 25, 6};

        for(int i=0; i< array.length; i++) {
            arrList.add(array[i]);
        }
        for(int j=0; j< sequence.length; j++) {
            seqList.add(sequence[j]);
        }
        assertTrue(isValidSubsequence(arrList, seqList));
    }
}
