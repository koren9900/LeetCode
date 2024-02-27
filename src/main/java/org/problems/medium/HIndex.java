package org.problems.medium;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n+1];
        for(int i: citations){
            if(i > n)
                count[n]++;
            else
                count[i]++;
        }
        int h = 0;
        for(int i = n   ; i >= 0; i--){
            h+= count[i];
            if(h>= i)
                return i;
        }
        return h;

    }
}
