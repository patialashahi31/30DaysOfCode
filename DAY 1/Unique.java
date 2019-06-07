class Unique{
	public static void main(String[] args) {
		int arr[] = {1,1,6,5,3,5,6};
		System.out.print(getUnique(arr));
	}
	static int getUnique(int arr[]){
		int res = 0;
		for(int i=0;i<arr.length;i++){
			res = res ^ arr[i];
		}
		return res;
	}
}