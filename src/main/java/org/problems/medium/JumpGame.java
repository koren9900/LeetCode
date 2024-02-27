package org.problems.medium;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach = nums[0];
        int i = 0;
        while(i < nums.length - 1 && reach > 0){
            i++;
            reach--;
            reach = Math.max(reach, nums[i]);


        }
        return i == nums.length -1 || (i == nums.length -2 && reach > 0);
    }
}
