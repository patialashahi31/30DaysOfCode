import java.util.*;
class SubArrayGivenSum{

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,5,11};
		int n=6;
		int start =0;
		int end = -1;
		int sum=0;
		int k=12;
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i=0;i<n;i++){
			sum += arr[i];
               if(sum-k==0){
               	start = 0;
                end = i;
                break;
               }
               if(h.containsKey(sum-k)){
               	start = h.get(sum-k) + 1;
               	end = i;
               	break;
               }
               h.put(sum,i);
		}
		if(end==-1){
			System.out.println("No");
		}else{
			System.out.println(start + " " + end);
		}
	}
}