/*
	f0 = 0
	f1 = 1;
	f2 = f0 + f1(0+1)
	
	fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
*/

class RecursionDemo1{
	
	public static int fibonacci(int num){
		if(num <= 1){ //base condition
			return num;
		}
		return fibonacci(num-1)+fibonacci(num-2); //recursive condition
	}
	
	public static void main(String[] args){
		int num = 10;
		
		for(int i =0; i<=num; i++){
			System.out.println("Fibonnaci of "+i+" : "+fibonacci(i));
		}
	}
}