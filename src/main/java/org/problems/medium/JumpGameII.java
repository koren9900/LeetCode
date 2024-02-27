package org.problems.medium;

public class JumpGameII {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int reach = 0;
        int i = 0;
        int jumps = 0;
        int max = 0;
        while(true){
            reach = Math.max(reach, i + nums[i]);
            if(reach >= nums.length - 1){
                jumps++;
                break;
            }
            if(i >= max){
                jumps++;
                max = reach;
            }
            i++;
        }

        return jumps;
    }
}
