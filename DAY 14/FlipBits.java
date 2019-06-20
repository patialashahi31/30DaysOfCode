class FlipBits{
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		System.out.println(flip(a,b));
	}
	static int flip(int a, int b){
		int n = a^b;
		int count=0;
		while(n!=0){
			if((n&1)==1){
				count++;
			}
			n = n>>1;
		}
		return count;
	}
}