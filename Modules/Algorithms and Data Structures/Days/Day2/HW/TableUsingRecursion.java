class TableUsingRecursion{
	
	public static void recursiveTable(int num,int start){
		if(start > 10){
			return;
		}
		System.out.println(num+" X "+start+" = "+(num*start));
		recursiveTable(num,++start);
		
	}

	public static void main(String[] args){
		
		recursiveTable(5,1);
	}
}