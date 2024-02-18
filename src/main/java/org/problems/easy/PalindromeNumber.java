package org.problems.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int n = 0;
        int t = x;
        while(t > 0){
            t/=10;
            n++;
        }
        if(x < 0)
            return false;
        int i = 0;
        while(i <= n/2){
            int lastDigit = (x/(int)Math.pow(10,n-i-1))%10;
            int firstDigit = (x%(int)Math.pow(10,i+1))/(int)Math.pow(10,i);
            if(lastDigit != firstDigit)
                return false;
            i++;
        }
        return true;

    }
}
