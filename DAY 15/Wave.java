class Wave{
	public static void main(String[] args) {
          int arr[] = {10, 90, 49, 2, 1, 5, 23}; 
          int n = arr.length;
          for(int i=1;i<n;i+=2){
          	if(arr[i]<arr[i-1]){
          		swap(arr,i,i-1);
          	}
          }
          for(int j=0;j<n-1;j+=2){
          	if(arr[j]<arr[j+1]){
          		swap(arr,j,j+1);
          	}
          }
          for(int k=0;k<n;k++){
          	System.out.print(arr[k] + " ");
          }

	}
	 static void swap(int arr[], int a, int b) 
    { 
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    } 
}