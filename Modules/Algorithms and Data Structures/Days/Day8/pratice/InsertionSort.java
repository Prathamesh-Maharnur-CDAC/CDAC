class InsertionSort{
	
	public void insertionSort(int[] arr){
		int n = arr.length;
		
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public void display(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		InsertionSort i = new InsertionSort();
		
		int arr[] = {44,77,22,99,11,55,66,33};
		
		System.out.println("Insertion sort - Unsorted array:");
		i.display(arr);
		i.insertionSort(arr);
		
		System.out.println("Insertion sort - Sorted array:");
		i.display(arr);
	
	}
}