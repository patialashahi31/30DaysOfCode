class ConvertToUpperCase{
	public static void main(String[] args) {
		String a = "hello";
		String b= "";
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>='a' && a.charAt(i)<='z'){
				char temp = a.charAt(i);
                 int temp1 = temp - 32;
                  temp = (char)temp1;
                 b += temp;
			}
           
			
		}
		System.out.println(b);
	}
}