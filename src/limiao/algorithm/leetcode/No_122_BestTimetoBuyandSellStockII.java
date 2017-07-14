package limiao.algorithm.leetcode;

/**
 * 122. Best Time to Buy and Sell Stock II
 * @author seektech
 * Oct 26, 2016 2:15:53 PM
 */
public class No_122_BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
		int profit = 0;
		int tmp;
		for(int i=1; i<prices.length; i++){
			tmp = prices[i] - prices[i-1];
			if(tmp > 0) profit +=tmp;
		}
		return profit;
    }
}
