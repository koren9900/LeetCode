package org.problems.hard;

public class Candy {
    public int candy(int[] ratings) {
        int min = min(ratings);
        int count = 1;
        int cur = 1;
        int slide = 0;
        int peak = -1;
        boolean peaked = false;
        for(int i = min - 1; i >=0 ; i--) {
            if(ratings[i] > ratings[i + 1]) {
                cur = cur +1;
                slide = 0;
                peaked = false;

            }
            else if(i == 0 || ratings[i -1] >= ratings[i]){
                cur = 1;
                slide = 0;
                peaked = false;
            }
            else {
                if(cur != 1)
                    peak = cur;
                if(ratings[i + 1] == ratings[i])
                    peaked = true;
                slide++;
                if(!peaked && slide + 1 == peak){
                    slide++;
                    peaked = true;
                }
                cur = 1;


            }
            count += cur + slide;
        }
        slide = 0;
        cur = 1;
        peak = -1;
        peaked = false;
        for(int i = min + 1; i < ratings.length ; i++){
            if(ratings[i] > ratings[i - 1]) {
                cur = cur + 1;
                //count -= slide;
                slide = 0;
                peaked = false;
            }
            else if(i == ratings.length - 1 || ratings[i + 1] >= ratings[i]){
                cur = 1;
                // count -= slide;
                slide = 0;
                peaked = false;
            }
            else {
                if(cur != 1)
                    peak = cur;
                if(ratings[i - 1] == ratings[i])
                    peaked = true;
                slide++;
                if(!peaked && slide + 1 == peak){
                    slide++;
                    peaked = true;
                }
                cur = 1;


            }
            count += cur + slide;
        }

        return count;
    }

    private int min(int[] ratings){
        int minVal = Integer.MAX_VALUE;
        int min = -1;
        for(int i = 0; i < ratings.length; i++)
            if(ratings[i] < minVal){
                minVal = ratings[i];
                min = i;
            }

        return min;
    }
}
