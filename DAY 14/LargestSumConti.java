class LargestSumConti{
	public static void main(String[] args) {
		int arr[] = {-1,10,15,-4,-6};
		int max =0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			if(sum>max){
				max=sum;
			}
			if(sum<0){
              sum=0;
			}
		}
		System.out.println(max);
	}
}