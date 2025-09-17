class Array{
	private int[] a1;
	private int n;
	
	public Array(int max){
		a1 = new int[max];
		n = 0;
	}
	
	void display(){
		for(int j=0;j<n;j++){
			System.out.print(a1[j] + " ");
		}
	}
	
	void insert(int value){
		a1[n] = value;
		n++;
	}
	
	boolean search(int key){
		int j;
		for(j=0;j<n;j++)
			if(a1[j] == key)
				break;
		
		if(j==n)
			return false;
		else
			return true;
		
	}
	
	
	
}


class ArrayDemo{
	
	
    public static void main(String[] args) {
		
		int size =100;
		Array a = new Array(size);
		
		//Insertion in array
		a.insert(22);
		a.insert(33);
		a.insert(44);
		a.insert(22);
		a.insert(77);
		a.insert(22);
		a.insert(99);
		a.insert(0);
		a.insert(55);
		
		//Traverse an array
		a.display();
		
		//search operation in array
		boolean x = a.search(91);
		if(x)
			System.out.println("Search Result: Found!!!");
		
		else
			System.out.println("Search Result: Not Found!!!");
		
	   
    }
 }
