package org.problems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrappingRainWater {
    public int trap(int[] height) {

        List<Integer> peaks = new ArrayList<>(height.length);
        List<Integer> peaksIndex = new ArrayList<>(height.length);
        List<Integer> trappingPeaks = new ArrayList<>(height.length);

        for(int i = 0;  i < height.length;  i++) {
            if(i == 0 || height[i] >= height[i - 1]) {
                if (i == height.length - 1 || height[i + 1] <= height[i]) {
                    peaksIndex.add(i);
                    peaks.add(height[i]);
                    int trappingPeak = -1;
                    for(int j = peaks.size() - 2; j >=0; j--){
                        if(peaks.get(j) > height[i]){
                            trappingPeak = j;
                            break;
                        }else if(trappingPeak == -1 || peaks.get(j) > height[peaksIndex.get(trappingPeak)]){
                            trappingPeak = j;
                        }
                    }
                    trappingPeaks.add(trappingPeak);
                   // int waterHeight = trappingPeak == -1 ?  height[i] :Math.min(height[trappingPeak], height[i]);
                }
            }
        }
        int i = peaks.size() - 1;
        int trappedWater = 0;
        while(i > 0){
            int min = Math.min(peaks.get(trappingPeaks.get(i)), peaks.get(i));
            for(int j = peaksIndex.get(trappingPeaks.get(i)) + 1; j < peaksIndex.get(i); j++){
                if(min - height[j] > 0)
                    trappedWater += min - height[j];
            }
            i = trappingPeaks.get(i);
        }

        return trappedWater;

    }
}
