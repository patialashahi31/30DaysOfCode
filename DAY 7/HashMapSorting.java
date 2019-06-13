import java.util.*;
import java.util.Map.*;
import java.util.Collections.*;
class HashMapSorting{
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		int arr[] = {3,3,3,7,5,1,1};
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);
			}
		}

		List<Integer> list = new LinkedList(map.entrySet());
		Collections.sort(list,new Comparator(){
			public int compare(Map.Entry o1,Map.Entry o2){
				return(o2.getValue()).compareTo(o1.getValue());
			}
		});
		System.out.println(list);
		StringBuilder res = new StringBuilder();
		for(int j=0;j<list.size();j++){
			for(int k=0;k<list.get(j).getValue();k++){
				res += res.append(list.get(j).getKey());
			}
		}
		System.out.println(res.toString());

		
	
	}

}