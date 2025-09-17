

//sum(10)=10+9+8+7+6+5+4+3+2+1=


class RecursionDemo5{
	
	
	static int sum(int n){
		if(n > 0)//base conditon
		{
			return n+sum(n-1);
		}
			return 0;//recursive condition
		
	}
	
    public static void main(String[] args) {
		
		int num =sum(10);
			
		System.out.print("Sum in reverse =  "+num);
		
		
	   
    }
 }
