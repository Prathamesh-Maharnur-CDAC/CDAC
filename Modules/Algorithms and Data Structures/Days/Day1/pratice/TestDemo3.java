// Reverse an arrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class TestDemo3{

	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Chickoo" ,"Grapes", "Apple", "Banana", "DragonFruit"));
		
		System.out.println("List: "+list);
		Collections.sort(list);
		System.out.println("Sorted List: "+list);
		
		// Reverse list
		//Method 1
		Collections.reverse(list);
		System.out.println("Reverse list: "+list);
		
		// Method 2
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse list using Collections.sort(list,Collections.reverseOrder())\n\t list: "+list);
	}
}