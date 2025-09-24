class BubbleSort{
	
	public void bubbleSort(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	public void display(int[] arr){
		int n = arr.length;
		
		for(int i = 0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		BubbleSort b = new BubbleSort();
		
		int[] arr = {44,77,22,99,11,55,66,33};
		
		System.out.println("Bubble Sort - Unsorted array:");
		b.display(arr);
		b.bubbleSort(arr);
		
		System.out.println("Bubble Sort - Sorted array:");
		b.display(arr);
	}
}