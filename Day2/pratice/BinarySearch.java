class BinarySearch{
	
	public static int binarySearch(int[] arr,int x,int lb, int ub){
		
		int mid = lb +(ub-lb)/2;
		
		if(ub>lb){
			if(arr[mid] == x){
				return mid;
			}
			if(arr[mid] > x){
				return binarySearch(arr,x,lb,mid-1);
			}
			return binarySearch(arr,x,mid+1,ub);
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {2,5,8,11,16,47,59,78};
		int x = 59;
		
		int n = arr.length;
		
		int result = binarySearch(arr,x,0,n-1);
		
		
		if(result == -1){
			System.out.println("Element not found!!!");
		}else{
			System.out.println("Element found!!!");
		}
	}
}