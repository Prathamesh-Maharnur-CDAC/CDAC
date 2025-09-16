class RecursionDemo1{
	
	static int i = 0;
	
	public static void show(){
		++i;
		if(i<5){
			System.out.println("show() method.................");
			show();
		}
	}
	
	public static void main(String[] args){
		System.out.println("Hello everyone!!!");
		show();
	}
}