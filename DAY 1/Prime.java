class Prime{
	public static void main(String[] args) {
		int x = 11;
		for(int i=2;i<=x;i++){
			if(getPrime(i)==1){
				System.out.print(i + " ");
			}
		}
	}
	static int getPrime(int n){
		if(n==1) return 0;
		if(n<0) return 0;
		if(n==2) return 1;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}
}