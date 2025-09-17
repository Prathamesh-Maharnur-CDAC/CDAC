// Tower of Hanoi problem

class RecursionDemo3{

	public static void towerOfHanoi(int num,char source,char auxillary,char destination){
		
		if(num == 1){
			System.out.println("Disk from "+source+" to "+destination);
		}else{
			towerOfHanoi(num-1,source,destination,auxillary);
			System.out.println("Disk from "+source+" to "+destination);
			towerOfHanoi(num-1,auxillary,source,destination);
		}
	}


	public static void main(String[] args){
		final int num = 3;
		towerOfHanoi(num,'A','B','C');
	}
}