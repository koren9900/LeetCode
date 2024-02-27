package org.problems.easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums)
            sum+=i;
        return (int) ((n+1)/2.0*n-sum);
    }
}
