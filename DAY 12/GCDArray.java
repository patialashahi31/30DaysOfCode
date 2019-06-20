class GCDArray{
	public static void main(String[] args) {
		int arr[] = {5,10,50};
		int ans = arr[0];

		for(int i=0;i<arr.length;i++){
			ans = gcd(ans,arr[i]);
		}
		System.out.println(ans);
	}
	static int gcd(int a, int b){
		int c=0;
		int d=0;
		if(a<=b){
            c=a;
            d=b;
		}else{
			c=b;
			d=a;
		}
		
            if(c==0) return d;
            return gcd(d%c,c);
		
	}
}