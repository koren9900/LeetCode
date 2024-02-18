package org.problems.medium;

import java.util.*;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> maxes = new PriorityQueue<>((o1, o2) -> o2-o1);
        int i = 0;
        while(i < heights.length - 1){
            int dis = heights[i+1]-heights[i];
            if(dis <= 0)
                i++;
            else{
                if(dis <= bricks){
                    bricks -= dis;
                    maxes.add(dis);
                    i++;
                }else{
                    if(ladders == 0)
                        return i;
                    else if(maxes.isEmpty() && ladders > 0)
                        ladders--;

                    else{
                        maxes.add(dis);
                        int max = maxes.poll();
                        bricks += max;
                        bricks -= dis;
                        ladders--;
                    }
                    i++;
                }
            }
        }
        return i;
    }
}
