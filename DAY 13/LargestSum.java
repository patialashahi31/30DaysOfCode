class LargestSum{
	public static void main(String[] args) {
		int arr[] = {2,-1,5,11,-2,2};
        System.out.println(cal(arr));
	}
	static int cal(int arr[]){
		int dp[] = new int[arr.length+1];
		
		for(int i=1;i<arr.length+1;i++){
			dp[i] = Math.max(dp[i],dp[i]+arr[i-1]);
            
		}
        int max=dp[0];
		for(int j=0;j<arr.length+1;j++){
            if(dp[j]>max){
            	max = dp[j];
            }
		}
		return max;
	}
}