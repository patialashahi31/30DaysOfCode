class Anagram{
	public static void main(String[] args) {
		String a = "hello";
		String b ="elljh";
		System.out.println(check(a,b));

	}
	static boolean check(String a , String b){
		int n = a.length();
		int m = b.length();
		if(n!=m) return false;
		int count[] = new int[256];
		int i;
		for(i=0;i<n;i++){
			count[a.charAt(i)]++;
		}
		for(i=0;i<n;i++){
			count[b.charAt(i)]--;
		}
		for(i=0;i<256;i++){
			if(count[i]!=0){
				return false;
			}
		}
		return true;
	}
}