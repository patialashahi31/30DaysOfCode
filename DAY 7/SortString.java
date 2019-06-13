import java.util.*;
class SortString{
	public static void main(String[] args) {
		String a= "volatile";
		char c[] = a.toCharArray();
		Arrays.sort(c);
		String b = String.valueOf(c);
		System.out.println(b);
	}
}