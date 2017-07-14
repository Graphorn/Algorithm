package limiao.algorithm.leetcode;

/**
 * 121. Best Time to Buy and Sell Stock
 * @author seektech
 * Oct 26, 2016 2:15:53 PM
 */
public class No_121_BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
		if(prices.length < 2) return 0;
		int profit = Integer.MIN_VALUE;
		int buy = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
        	buy = prices[i]<buy?prices[i]:buy;
        	profit = prices[i]-buy>profit?prices[i]-buy:profit;
        }
        return profit;
    }
}
