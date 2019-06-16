class LongestCommonSubstring{
	public static void main(String[] args) {
		String a  = "abcdef";
		String b = "zbcde";
		System.out.println(calculate(a,b));
	}
	static int calculate(String a,String b){
		int n = a.length();
		int m = b.length();
		int dp[][] = new int[m+1][n+1];
		int max=0;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(b.charAt(i-1)==a.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
				if(max<dp[i][j]){
					max = dp[i][j];
				}
			}
		}
		
	}
return max;}}
