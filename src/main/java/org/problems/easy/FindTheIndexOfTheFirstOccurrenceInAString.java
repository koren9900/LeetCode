package org.problems.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        char[] nedle = needle.toCharArray();
        char[] hystck = haystack.toCharArray();
        int idx = 0;
        int trck = 0;
        for(int i = 0; i < hystck.length; i++){
            if(hystck[i] == nedle[trck])
                trck++;
            else {
                idx++;
                i -= trck;
                trck = 0;

            }
            if(trck == nedle.length)
                return idx;
        }
        return -1;
    }
}
