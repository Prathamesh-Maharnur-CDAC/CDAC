class LinearSearch{
	
	public static int search(int[] arr, int x){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
		
		
	}
	
	public static void main(String[] args){
		int[] arr = {101,37,59,21,78,61,45,50,81,24,33};
		int x = 61;
		
		int result = search(arr,x);
		
		if(result == -1){
			System.out.println("Element not found!!!");
		}else{
			System.out.println("Element found!!!");
		}
	}
}