class StringReversal{
	static void stringReverse(String str){
		if(str==null || str.length()<=1){
			System.out.println(str);
		}else{
			System.out.print(str.charAt(str.length()-1));
		    stringReverse(str.substring(0,str.length()-1));
		}
		
	}

	
	public static void main(String[] args){
		
		String input = "Prathamesh Sunil Maharnur";
		System.out.println("original = "+input);
		System.out.print("Reverse = ");
		stringReverse(input);
	
		
	}
}