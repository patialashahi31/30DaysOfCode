import java.util.*;
class LongestIncreasingSubsequence{
	public static void main(String[] args) {
		int arr[] = {3,4,-1,0,6,2,3};
		int n = arr.length;

		int max=1;
		int dp[] = new int[arr.length];
		
		for(int k=0;k<n;k++){
			dp[k] = 1;
			
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}