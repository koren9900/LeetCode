package org.problems.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int c = 1;
        for(int i = 1; i< nums.length;i++)
            if(nums[i] == cur)
                nums[i]=Integer.MAX_VALUE;
            else {
                cur = nums[i];
                nums[c] = nums[i];
                c++;
            }
        return c;
    }
}
