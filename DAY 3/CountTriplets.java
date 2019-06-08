import java.util.*;
class CountTriplets{
	public static void main(String[] args) {
		int arr[] = {7,2,5};
		int n =3;
		int j;
		HashMap<Integer,Integer> h = new HashMap<>();
	     int count=0;
	     for(j=0;j<n;j++){
	         h.put(arr[j],j);
	     }
	     Arrays.sort(arr);
	     for(j=0;j<n;j++){
	         for(int k=j+1;k<n;k++){
	             if(h.containsKey(arr[j] + arr[k])){
	                 count++;
	             }
	         }
	     }
	     if(count==0){
	         System.out.println("-1");
	     }else{
	         System.out.println(count);
	     }
	}
}