class MergeSort{

	public static void mergeSort(int[] arr, int l, int r){
		if(l<r){
			int mid = l+(r-l)/2;
			mergeSort(arr, l, mid-1);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	public static void merge(int[] arr, int l, int mid, int r){
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0;i<n1;i++){
			L[i] = arr[l+i];
		}
		
		for(int j = 0;j<n2;j++){
			R[j] = arr[mid+1+j];
		}
		
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2){
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	void display(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		MergeSort m = new MergeSort();
		int arr[] = {44,77,22,99,11,55,66,33};
		int n = arr.length;
		
		
		System.out.print("Merge Sort - Unsorted array: ");
		m.display(arr);
		
		
		m.mergeSort(arr,0,n-1);
		
		System.out.print("Merge Sort - Sorted array: ");
		m.display(arr);
		
	}
	
}