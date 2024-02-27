package org.problems.medium;

public class BestTimeToBuyAndSellStocksII {
    public int maxProfit(int[] prices) {
        int count = 0;
        for(int i = 0; i< prices.length - 1;i++){
            int dis = prices[i+1]-prices[i];
            count += Math.max(dis, 0);
        }
        return count;
    }

}
