package org.problems.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int st = 0;
        int en = s.length() - 1;
        while(en>st){
            while(!Character.isLetterOrDigit(s.charAt(st)))
                st++;

            while(!Character.isLetterOrDigit(s.charAt(en)))
                en--;

            if(s.charAt(st) != s.charAt(en))
                return false;
        }
        st++;
        en--;
        return true;
    }
}
