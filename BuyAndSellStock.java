package leetCode;

/**
 * You are given an integer array prices where prices[i] is the price of a stock on the ith day
 * you want to maximaize the profit by choosing a single day tp buy one stock and choosing a diff
 * day in the future to sell that stock.
 */
public class BuyAndSellStock {

	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i< prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}
}
