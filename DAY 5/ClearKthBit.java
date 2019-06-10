class ClearKthBit{
	public static void main(String[] args) {
		int n = 5;
		int k=2;
		int mask = ~(1<<k);
		int res = n&mask;
		System.out.println(res);
	}
}