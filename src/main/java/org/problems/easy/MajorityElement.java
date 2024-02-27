package org.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int i: nums)
            if(counter.containsKey(i))
                counter.replace(i, counter.get(i)+1);
            else
                counter.put(i, 1);

        int max = 0;
        int maxVal = 0;
        int cur;
        for(int i : counter.keySet()) {
            cur = counter.get(i);
            if (cur > maxVal) {
                maxVal = cur;
                max = i;
            }
        }

        return max;
    }
}
