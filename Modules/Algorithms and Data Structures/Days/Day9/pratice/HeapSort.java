class HeapSort{

	public void heapSort(int[] arr){
		int n = arr.length;
		//Heap building: All values of array get inserted in max heap
		for(int i=n/2;i>=0;i--){
			//Max heap is balanced or not ?If not it wil balance 
			heapify(arr,n,i);
		}
		
		//Root element is replaced by i th index: last element
		for(int i=n-1;i>0;i--){
			int temp =arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			//Again balance will be checked for max heap 
			heapify(arr,i,0);
		}
	}
	
	void heapify(int[] arr, int n, int i){
		
		//Parent , LC, RC relationship is build
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		//LC > Parent: largest = LC
		if(l<n && arr[l] > arr[largest]){
			largest = l;
		}
		
		//RC > Parent: largest = RC
		if(r<n && arr[r] > arr[largest]){
			largest = r;
		}
		
		//Call out a swapping with largest = parent
		if(largest!=i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			//Check max heap is balance?
			heapify(arr,n,largest);
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
		HeapSort h = new HeapSort();
		
		int arr[] = {44,77,22,99,11,55,66,33};
		int n = arr.length;
		
		
		System.out.print("Heap Sort - Unsorted array: ");
		h.display(arr);
		
		
		h.heapSort(arr);
		
		System.out.print("Heap Sort - Sorted array: ");
		h.display(arr);
	}
}