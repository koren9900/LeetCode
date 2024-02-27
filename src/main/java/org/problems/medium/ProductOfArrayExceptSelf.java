package org.problems.medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int prod = 1;
        for(int i : nums)
            if(i == 0)
                zeros++;
            else
                prod *= i;
        int[] prods = new int[nums.length];
        if(zeros > 1)
            return prods;
        for(int i = 0; i < nums.length; i++){
            if(zeros == 1 && nums[i] != 0)
                prods[i] = 0;
            else if(nums[i] == 0)
                prods[i] = prod;
            else
                prods[i] = prod/nums[i];
        }
        return prods;
    }
}
