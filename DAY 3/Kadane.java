class Kadane{
	public static void main(String[] args) {
		int arr[] = {1,3,-1};
		int n=3;
		int j;
	     
	     int sum = 0;
	     int max = Integer.MIN_VALUE;
	     for(j=0;j<n;j++){
	         sum += arr[j];
	         if(sum>max){
	             max = sum;
	         }
	         if(sum<0){
	             sum=0;
	         }
	     }
	    
	     System.out.println(max);
	}
}