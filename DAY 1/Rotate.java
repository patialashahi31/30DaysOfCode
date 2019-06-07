class Rotate{
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int d = 2;
		rot(arr1,d);
		printArray(arr1);

	}
	static void rev(int[] arr,int a,int b){
		int start=a;
		int end = b;
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	static void rot(int[] arr,int d){
          int n = arr.length;
		
			rev(arr,0,d-1);
			rev(arr,d,n-1);
			rev(arr,0,n-1);
		
		
	}
	static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 
}