class OddEvenUsingBits{
	public static void main(String[] args) {
		int n = 5;
		int flag=0;
		if((n&1)==1){
			System.out.println("odd");
		}else{
			System.out.println("even");
		}
	}
}