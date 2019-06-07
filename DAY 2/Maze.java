import java.util.*;
import java.io.*;
class Maze{
	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		if(q>s.length()){
			System.out.println("NO");
		}else{
		String res="";
		for(int i=1;i<=q;i++){
			char a = sc.next().charAt(0);
			int n = sc.nextInt();
			String x ="";
			
			if(a=='L'){
              x = left(s,n);
              s = x;
              res += s.charAt(0);
			}
			else{
				x= right(s,n);
				s = x;
				res += s.charAt(0);
			}
			
		}
		    int flag=0;
			int c=0;

			while(c+q<=s.length()){
				String comp = s.substring(c,c+q);
				if(check(res,comp)==true){
					System.out.println("YES");
					flag = 1;
					break;
				}else{
					c++;
				}

			}
			if(flag==0 ){
				System.out.println("NO");
				
			}}}catch(Exception e){
				return;
			}


	}
	static String left(String s , int n){
		return s.substring(n) + s.substring(0,n);
	}
	static String right(String s, int n){
		
		return left(s,s.length()-n);
	}
	static boolean check(String a, String b){
		int count[] = new int[256];
		int j;
		for(j=0;j<a.length();j++){
			count[a.charAt(j)]++;
		}
		for(j=0;j<b.length();j++){
			count[b.charAt(j)]--;
		}
		for(j=0;j<256;j++){
			if(count[j]!=0) return false;
		}
		return true;
	}

}