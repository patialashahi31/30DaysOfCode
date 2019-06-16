import java.util.*;
import java.util.Map.*;
class CountFrequency{
	public static void main(String[] args) {
		String a= "aaabbccaallg";
		HashMap<Character,Integer> h = new HashMap<>();
		int j;
		for(j=0;j<a.length();j++){
			if(h.containsKey(a.charAt(j))){
				h.put(a.charAt(j),h.get(a.charAt(j))+1);
			}else{
			    h.put(a.charAt(j),1);	
			}
		}
		for(Entry<Character,Integer> entry : h.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		TreeMap<Character,Integer> tree = new TreeMap<>(h);
		System.out.println(tree);
	}
}