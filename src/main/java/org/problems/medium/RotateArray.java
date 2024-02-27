package org.problems.medium;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k == 0)  return;
        int i = -1;
        long sum = (long) ((n + 1) / 2) *(n);
        long count = 1;
        int c = -1;
        int cur;
        do{
            c++;
            i++;
            cur = nums[i];
            do {
                int tmp = nums[(c + k)%n];
                nums[(c + k)%n] = cur;
                cur = tmp;
                c = (c + k)%n;
                count += c+1;
            }while(c != i);
        }while(count < sum);
    }

}
