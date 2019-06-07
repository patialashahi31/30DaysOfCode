class Leap{
	public static void main(String[] args) {
		int n = 1800;
		if(check(n)){
			System.out.println("Leap");
		}else{
			System.out.println("No");
		}
	}
	static boolean check(int n){
		if(n%400==0) return true;
		if(n%100!=0 && n%4==0) return true;
        return false;
	}
}