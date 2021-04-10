package practice.coding.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> uniqueNums1 = new HashSet<>();
        for(int i=0; i< nums1.length; i++) {
            uniqueNums1.add(nums1[i]);
        }

        Set<Integer> uniqueNums2 = new HashSet<>();
        for(int i=0; i< nums2.length; i++) {
            uniqueNums2.add(nums2[i]);
        }

        Set<Integer> smallerSet ;
        int[] returnArray;

        if(uniqueNums1.size() <= uniqueNums2.size()) {
            returnArray = new int[uniqueNums1.size()];
            smallerSet = uniqueNums1;
        } else {
            returnArray = new int[uniqueNums2.size()];
            smallerSet = uniqueNums2;
        }

        return new int[2];

    }

}
