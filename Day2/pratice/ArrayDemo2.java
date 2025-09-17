class ArrayDemo2{
	
	private int[] arr;
	private int num;
	
	ArrayDemo2(int max){
		arr = new int[max];
		num=0;
	}
	
	
	public void insert(int e){
		arr[num] = e;
		num++;
	}
	
	public void display(){
		for(int i = 0;i<num;i++){
			System.out.println(arr[i]+"\t");
		}
	}
	
	public boolean search(int key){
		int j;
		for(j=0;j<num;j++)
			if(arr[j] == key)
				break;
			
		if(j == num)
			return false;
		else
			return true;
	}
	
	public boolean delete(int key){
		int j;
		for(j=0;j<num;j++)
			if(arr[j] == key)
				break;
			
		if(j == num)
			return false;
		else{
			for(int k =j;k<num-1;k++){
				arr[k] = arr[k+1];
			}
			num--;
			return true;
		}
	}
	
	public static void main(String[] args){
		ArrayDemo2 obj = new ArrayDemo2(20);
		
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		obj.insert(60);
		obj.insert(70);
		obj.insert(80);
		obj.insert(90);
		obj.insert(100);
		
		obj.display();
		//System.out.println(obj.num);
		
		
		boolean result = obj.search(1);
		
		
		if(result){
			System.out.println("Given number found in array!!!");
		}else{
			System.out.println("Given number does not exist in array!");
		}
		
		
		boolean delete = obj.delete(20);
		if(delete){
			System.out.println("Given number deleted from array!!!");
		}else{
			System.out.println("Given number does not exist in array!");
		}
	}
}