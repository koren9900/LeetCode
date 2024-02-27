package org.problems.easy;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int min = prices[0];
        int max = 0;
        for(int i : prices){
            if(max < i - min)
                max = i - min;
            if(i < min)
                min = i;
        }
        return max;
    }
}
