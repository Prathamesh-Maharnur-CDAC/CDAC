class SumSeries{

	static float sumSeries(int start,int end){
		float sum = 0;
		if(start>end){
			return sum;
		}else{
			if(start%2 == 0)
				sum -= (float)1/start;
			else
				sum += (float)1/start;
			return sum+sumSeries(++start,end);
		}
		 
	}

	public static void main(String[] args){
		float sum = sumSeries(1,3);
		System.out.println("1 - 1/2 +1/3 - ..... = "+sum);
	}
}