//To remove duplicates from ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


class TestDemo2{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,3,7,9,2,12,67,1,0));
		
		// preserve insertion order
		ArrayList<Integer> unique = new ArrayList<>(new LinkedHashSet(list));
		
		System.out.println("Original list: "+list);
		System.out.println("List without duplicate elements: "+unique);
	
	}
}