//Sort an arraylist in ascending and descending order

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class TestDemo5{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Papaya", "Mango", "Orange", "Apple", "Grapes"));
		
		System.out.println("Original list: "+list);
		
		Collections.sort(list);
		System.out.println("Ascending Sorted list: "+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Descending Sorted list(reverOrder()): "+list);
	}
}