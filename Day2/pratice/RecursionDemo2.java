class RecursionDemo2{
	
	public static int sum(int num){
		if(num>0){ //base condition
			return num+sum(num-1);
		}
		return 0; //recursive condition
	}
	
	public static void main(String[] args){
		int num = 10;
		
		System.out.println("The sum of "+num+" using reverse order: "+sum(10));
	}
}