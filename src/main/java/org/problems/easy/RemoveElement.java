package org.problems.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = nums.length-1;
        int count = 0;
        while(i >= 0 && nums[i] == val) {
            count++;
            i--;
        }
        if(i < 0)
            return 0;

        for(int j = 0; j < i; j++){
            if(nums[j]==val){
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i] = temp;
                i--;
                while(nums[i] == val) {
                    i--;
                    count++;
                }
                count++;
            }
        }
        return nums.length - count;
    }
}
