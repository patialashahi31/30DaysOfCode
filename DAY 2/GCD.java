class GCD{
	public static void main(String[] args) {
		int a=13;
		int b=20;
		System.out.println(gcd(a,b));
		int lcm = (a*b)/gcd(a,b);
		System.out.println(lcm);
	}
	static int gcd(int a,int b){
		if(a==0 ) return b;;
		return gcd(b%a,a);
	}
}