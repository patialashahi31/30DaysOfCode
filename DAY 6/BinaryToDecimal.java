class BinaryToDecimal{
	public static void main(String[] args) {
		String a = "0111";
		String b = ""; 
		int n=0;
		int j;
		for(j=a.length()-1;j>=0;j--){
			char d = a.charAt(j);
			b += d;
		}
		for(j=0;j<a.length();j++){
			if(b.charAt(j)=='1'){
				n += Math.pow(2,j);
			}
		}
		System.out.println(n);
	}
}