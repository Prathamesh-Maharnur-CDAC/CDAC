/*f0 = 0
f1 = 1
f2=f0+f1=1
fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)
*/
class RecursionDemo4 {
	
	
	static int fibonacci(int n){
		if(n <= 1)//base conditon
		{
			return n;
		}
			return fibonacci(n-1)+fibonacci(n-2);//recursive condition
		
	}
	
    public static void main(String[] args) {
		
		int num =50;
		
		for(int i=0;i<=num;i++){
		
		System.out.print(fibonacci(i)+" ");
		
		}
		
	   
    }
 }
