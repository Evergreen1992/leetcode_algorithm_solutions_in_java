package leetcode.dynamicprogramming;

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		if( prices == null || prices.length == 0 )
			return 0 ;
		int maxProfit = 0 , currentMin = prices[0] ;
		for( int i = 0 ; i < prices.length; i ++){
			if( prices[i] - currentMin >= maxProfit)
				maxProfit = prices[i] - currentMin ;
			if( currentMin > prices[i]){
				currentMin = prices[i] ;
			}
		}
        return maxProfit ;
    }

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{3,2,1,4,5,6,3,4,8,11}));
	}
}
