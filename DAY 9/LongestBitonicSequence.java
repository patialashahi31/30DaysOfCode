import java.util.*;
class LongestBitonicSequence{
	public static void main(String[] args) {
		int arr[] = {2,-1,4,3,5,-1,3,2};
		int n = arr.length;
		int right[] = new int[n];
		int left[] = new int[n];
		for(int k=0;k<n;k++){
			left[k] = 1;
			right[k] = 1;
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
                    left[i] = Math.max(left[i],left[j]+1);
                    
				}
			}
		}
		for(int l=n-2;l>=0;l--){
			for(int m=n-1;m>l;m--){
				if(arr[m]<arr[l]){
					right[l] = Math.max(right[l],right[m]+1);
				}
			}
		}
		Arrays.sort(left);
		Arrays.sort(right);
		System.out.println(left[n-1]+right[n-1]-1);
	}
}