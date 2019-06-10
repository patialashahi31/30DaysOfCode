class MinBitsAtoB{
	public static void main(String[] args) {
		int a=11;
		int b= 15;
		int res = a^b;
		SetBits(res);
	}
	static void SetBits(int n){
		int count=0;
		while(n>0){
			count += (n&1);
			n=n>>1;
		}
		System.out.println(count);
	}
}