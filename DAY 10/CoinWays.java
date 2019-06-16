class CoinWays{
	public static void main(String[] args) {
		int total = 5;
         int coins[] = {1,2,3};
         System.out.println(calculate(total,coins));
	}
	static int calculate(int total,int[] coins){
		int dp[][] = new int[coins.length+1][total+1];
		int j;
		int i;
		for(i=0;i<=coins.length;i++){
			
				dp[i][0] = 1;
			
		}
		for(i=1;i<=coins.length;i++){
			for(j=1;j<=total;j++){
				if(coins[i-1]>j){
					dp[i][j] = dp[i-1][j];
				}else{
					dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
					
				}
			}
		}
		return dp[coins.length][total];
	}
}