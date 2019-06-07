class TCSFib{
	public static void main(String[] args) {
		int n=15;
		System.out.println(fib(n));
	}
	static int fib(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		return fib(n-1) + fib(n-2);
	}
}