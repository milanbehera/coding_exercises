package practice.coding.arrays;

import java.util.Arrays;

public class MakeArrayConsecutive {

    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int statuesRequired = 0;
        for(int i=0 ; i<statues.length -1 ; i++) {
            statuesRequired = statuesRequired + (statues[i+1] - statues[i]);
        }
        return statuesRequired;
    }
}
