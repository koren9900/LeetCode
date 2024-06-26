package org.problems.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}
