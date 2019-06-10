//Decimal to graycode and back to decimal
class GrayCode{
	public static void main(String[] args) {
		int n = 10;
		int res = n^(n>>1);
		System.out.println(res);
	}
}