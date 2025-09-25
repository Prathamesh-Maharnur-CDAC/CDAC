class SelectionSort{

	public void selectionSort(int[] arr){
		int n = arr.length;
		
		// n-1 if not give in condition still makesthe condition false in inner for loop
		for(int i=0;i<n-1;i++){ 
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[min]){
					min = j;	
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;			
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
		SelectionSort s = new SelectionSort();
		
		int arr[] = {44,77,22,99,11,55,66,33};
		
		System.out.println("Selection sort - Unsorted array:");
		s.display(arr);
		s.selectionSort(arr);
		
		System.out.println("Selection sort - Sorted array:");
		s.display(arr);
	}

}