class SetKthBit{
	public static void main(String[] args) {
		int n = 10 ;
		int k = 2;
		int mask = 1<<k;
		int res = n|(mask);
		System.out.println(res);
	}
}