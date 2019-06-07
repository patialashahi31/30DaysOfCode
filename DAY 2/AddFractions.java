class AddFractions{
	public static void main(String[] args) {
		int num1 = 1;
		int den1 = 3;
		int num2 = 3;
		int den2 = 9;
		int num3 = num1*den2 + num2*den1;
		int den3 = den1*den2;
		int div;
		if(den3>num3){
            div = num3;
		}else{
			div = den3;
		}
		for(int i=div;i>0;i--){
			if(num3%i==0 && den3%i==0){
				num3 = num3/i;
				den3 /= i;
			}
		}
		System.out.println(num3 + "/" + den3);

	}
}