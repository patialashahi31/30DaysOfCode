class Fib{
	public static void main(String[] args) {
		int n = 7;
		System.out.println(getbyDP(n));
	System.out.println(getByIteration(n));
	}
	static int getbyDP(int n){
		int dp[] = new int[n];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<n;i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n-1];
	}
	static int getByIteration(int n){
		int first = 0;
		int second = 1;
	
		
		for(int i=1;i<n;i++){
			
			int next = first + second;
			first = second;
			second = next;
		}
		
		return first;
	}
}