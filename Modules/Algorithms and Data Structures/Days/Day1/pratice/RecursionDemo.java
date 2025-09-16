class RecursionDemo{
	
	public static void show(){
		System.out.println("show method................");
		show();
	}
	
	public static void main(String[] args){
		System.out.println("Hello everyone!!!!!!!!!");
		show();
	}
}