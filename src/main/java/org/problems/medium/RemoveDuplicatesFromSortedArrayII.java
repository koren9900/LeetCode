package org.problems.medium;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int j = 0;
        for(Integer i: nums){
            if(count.containsKey(i)){
                int ic = count.get(i);
                if(ic < 2){
                    nums[j]= i;
                    count.put(i, ic + 1);
                    j++;
                }
            }else{
                count.put(i, 1);
                nums[j] = i;
                j++;
            }
        }
        return j;
    }
}
