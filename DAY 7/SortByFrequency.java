import java.util.*;
class SortByFrequency{
	static int x=0;
	public static void main(String[] args) {
		int arr[] = {3,3,3,7,5,1,1};
		int n = arr.length;
		int b[][] = new int[n][2];
		 Arrays.sort(arr);
		b[x][0] = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]==arr[i-1]){
				b[x][1] = b[x][1] + 1;
			}else{
				x++;
				b[x][0] = arr[i];
			}
		}
		x++;
        b = sort(b);
        for(int j=0;j<x;j++){
        	for(int k=0;k<=b[j][1];k++){
        		System.out.print(b[k][0] + " ");
        	}
        }

	}
	static int[][] sort(int b[][]){
             int c[] = new int[2];
             for(int i=0;i<x;i++){
             	for(int j=i;j<x;j++){
             		if(b[i][1]<b[j][1]){
             			c = b[i];
             			b[i] = b[j];
             			b[j] = c;
             		}
             	}
             }
             return b;
             	}
}