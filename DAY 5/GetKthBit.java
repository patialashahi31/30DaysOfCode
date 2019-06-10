class GetKthBit{
	public static void main(String[] args) {
		int n = 5;
		int k=2;
		int mask = (1<<k);
		int res = n&mask;
		if(res!=0){
			System.out.println("1");
		}else{
			System.out.println("0");
		}

	}
}