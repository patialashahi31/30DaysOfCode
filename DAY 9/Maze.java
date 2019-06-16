import java.util.*;
import java.io.*;
class Maze{
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for(int i=1;i<=t;i++){
        	int n = sc.nextInt();
        }*/
        permute(factors(10));
       
	}
	static int check(int n){
      return 0;
	}
	static int[] factors(int n){
		int arr[] = new int[n];
		int k=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				k = k+1;
               arr[k] = i;
               
			}
		}
		return arr;
	}
	public static void permute(int[] arr){
    permuteHelper(arr, 0);
}

private static void permuteHelper(int[] arr, int index){
    if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
        //System.out.println(Arrays.toString(arr));
        //Print the array
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        if(arr.length > 0) 
            System.out.print(arr[arr.length - 1]);
        System.out.println("]");
        return;
    }

    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

        //Swap the elements at indices index and i
        int t = arr[index];
        arr[index] = arr[i];
        arr[i] = t;

        //Recurse on the sub array arr[index+1...end]
        permuteHelper(arr, index+1);

        //Swap the elements back
        t = arr[index];
        arr[index] = arr[i];
        arr[i] = t;
    }
}
}