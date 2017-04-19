package company.mi;
//3,8,5,1,7,8
//12
/*
风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。 给你一个回顾历史的机会，
已知一支股票连续n天的价格走势，以长度为n的整数数组表示，数组中第i个元素（prices[i]）
代表该股票第i天的股价。 假设你一开始没有股票，但有至多两次(买入1股而后卖出1股)的机会，
并且买入前一定要先保证手上没有股票。若两次交易机会都放弃，收益为0。 设计算法，计算你能获得的最大收益。 
输入数值范围：2<=n<=100,0<=prices[i]<=100 

 */
//3,8,5,1,7,8
public class SellStack {
	public static int calculateMax(int[] prices) {
		/*//买卖一次
		int[] dp1 = new int[prices.length];
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < prices.length; i ++){
			int min = Integer.MAX_VALUE;
			for(int j = 0 ; j < i; j ++){
				if( prices[j] < min)
					min = prices[j];
			}
			dp1[i] = prices[i] - min ;
			if( dp1[i] > max)
				max = dp1[i];
		}*/
		//买卖2次
		int result = 0;//动态规划
		int[] dp = new int[prices.length];
		for(int i = 0 ; i < prices.length; i ++){
			int min = prices[0];
			for(int j = 0; j <= i; j ++){//0-i天
				if( prices[j] < min)
					min = prices[j];
			}
			//i+1   n-1
			int min1 = 0, max1 = 0;
			for(int j = i + 1; j < prices.length; j ++){
				if( prices[j] < min1)
					min1 = prices[j];
				if( prices[j] - min1 > max1)
					max1 = prices[j] - min1;
			}
			dp[i] = prices[i] - min + max1;
			if( dp[i] > result)
				result = dp[i];
		}
		
		return result ;//> max ? result : max;
    }
	public static void main(String[] args) {
		System.out.println(calculateMax(new int[]{31,41}));
	}
}