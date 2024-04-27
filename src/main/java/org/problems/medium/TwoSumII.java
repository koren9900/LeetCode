package org.problems.medium;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] ansIndexes = new int[]{0,1};
        int max1 = numbers.length-1;
        while(numbers[ansIndexes[0]]+numbers[ansIndexes[1]]!=target){
            if(numbers[ansIndexes[0]]+numbers[ansIndexes[1]] < target){
                if(ansIndexes[1] < max1)
                    ansIndexes[1]++;
                else
                    ansIndexes[0]++;
            }
            else{
                max1 = ansIndexes[1] - 1;
                ansIndexes[1]--;
            }
        }
        return ansIndexes;
    }
}
