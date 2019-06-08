class MissNumber{
	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		int n=5;
		int sum = (n*(n+1) )/2;
		int sum2 = 0;
		int j;
		for(j=0;j<arr.length;j++){
			sum2 += arr[j];
		}
		System.out.println(sum-sum2);
	}
}