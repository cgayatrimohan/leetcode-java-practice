package leetCode;

/*
 * 1672. Richest Customer Wealth
 */
public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = {{1,2,3}, {3,2,1}};
		
		int maxWealth = maximumWealth(accounts);
		System.out.println("Maximum wealth: " + maxWealth);
	}

	private static int maximumWealth(int[][] accounts) {
		int maxWealthSoFar = 0;
		
		for(int[] account : accounts) {
			int currCustomerWealth = 0;
			
			for(int money : account) {
				currCustomerWealth += money;
			}
			maxWealthSoFar = Math.max(maxWealthSoFar, currCustomerWealth);
		}
		return maxWealthSoFar;
	}

}
