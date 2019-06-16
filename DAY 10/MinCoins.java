class MinCoins{
	public static void main(String[] args) {
		int total = 13;
		int coins[] = {7,3,2,6};
		calculate(total,coins);
	}
	static int calculate(int total,int coins[]){
		int T[] = new int[total+1];
		int R[] = new int[total+1];
		int i;
		T[0] = 0;
		R[0]=-1;
		for(i=1;i<=total;i++){
			T[i] = Integer.MAX_VALUE-1;
			R[i] = -1;
		}
		int j;
		for(j=0;j<coins.length;j++){
			for(i=1;i<=total;i++){
				if(i>=coins[j]){
					T[i] = Math.min(T[i],1+T[i-coins[j]]);
					R[i] = j;
				}
			}
		}
		print(R,coins);
		return T[total];
	}
	static void print(int[] R,int[] coins){
		if(R[R.length-1]==-1){
			System.out.println("No combination");
			return;
		}
		int start = R.length-1;
		while(start!=0){
			int j= R[start];
			System.out.print(coins[j] + " ");
			start = start - coins[j];
		}

	}
}