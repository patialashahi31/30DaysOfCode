class MaxSum{
	public static void main(String[] args) {
		int n =12;
		System.out.println(sum(n));
	}
	static int sum(int n){
		if(n<12) return n;
		else
			return Math.max(n,sum(n/2) + sum(n/3 )+ sum(n/4));
	}
}