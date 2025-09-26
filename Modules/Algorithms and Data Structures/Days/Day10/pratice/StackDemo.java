class StackDemo{
	
	
	final static int MAX = 5;
	int[] arr = new int[MAX];
	int top;
	
	
	StackDemo(){
		top = -1;
	}
	
	boolean isEmpty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}
	
	
	boolean isFull(){
		if(top > MAX-1){
			return true;
		}else{
			return false;
		}
	}
	
	boolean push(int x){
		if(top >= MAX-1){
			System.out.println("StackOverflow!!!!");
			return false;
		}else{
			arr[++top] = x;
			System.out.println(x+" : pushed to stack");
			return true;
		}
		
	}
	
	int pop(){
		if(top<0){
			System.out.println("StackUnderflow!!!");
			return 0;
		}else{
			int x=arr[top--];
			return x;
		}
	}
	
	int peek(){
		if(top<0){
			System.out.println("StackUnderFlow");
			return 0;
		}else{
			int x = arr[top];
			return x;
		}
	}
	
	
	public static void main(String[] args){
		StackDemo s = new StackDemo();
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println("Before pop(): "+s.peek()+" : peek element");
		System.out.println("Pop(): "+s.pop());
		System.out.println("After pop(): "+s.peek()+" : peek element");
	}
}