package org.problems.medium;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> passed = new HashMap<>();
        int max = 0;
        int cur = 0;
        int last = 1;
        for(int i = 0; i < s.length();i++){
            if(passed.containsKey(s.charAt(i))){
                passed = new HashMap<>();
                if(cur > max){
                    max = cur;

                }
                i = last - 1;
                last = last + 1;
                cur = 0;

            }
            else{
                passed.put(s.charAt(i), true);
                cur++;
            }
        }
        if(cur > max)
            max = cur;
        return max;
    }
}
