class BubbleSort1{
	
	public void bubbleSort(int[] arr){
		int n = arr.length;
		boolean swapped;
		
		for(int i=0;i<n;i++){
			swapped = false;
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
					break;
			}
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
		BubbleSort1  b = new BubbleSort1();
		
		int arr[] = {44,77,22,99,11,55,66,33};
		
		System.out.println("BubbleSort - Unsorted array:");
		b.display(arr);
		b.bubbleSort(arr);
		
		System.out.println("BubbleSort - Sorted array:");
		b.display(arr);
	}
}