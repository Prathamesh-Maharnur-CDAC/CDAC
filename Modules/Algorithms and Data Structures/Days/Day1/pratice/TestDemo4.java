//Traversing an ArrayList using various methods

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;


class TestDemo4{
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Banana", "Chickoo", "Apple"));
		
		
		// Method 1: for loop
		System.out.print("\nlist = ");
		for(int i =0; i<list.size(); i++){
			System.out.print("\t"+list.get(i));
		}
		System.out.println("\n********************************************************************");
		
		
		// Method 2: for each loop
		System.out.print("\nlist = ");
		for(String s: list){
			System.out.print("\t"+s);
		}
		System.out.println("\n********************************************************************");
		
		
		// Method 3: Iterator -> forward direction only ( List, Set & Queue)
		System.out.print("\nlist = ");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print("\t"+it.next());
		}
		System.out.println("\n********************************************************************");
		
		
		//Method 4: ListIterator -> forward direction (only List)
		// first traverse in forward then only reverse direction will work
		System.out.print("\nlist = ");
		ListIterator lt = list.listIterator();
		while(lt.hasNext()){
			System.out.print("\t"+lt.next());
		}
		System.out.println("\n********************************************************************");
		
		//ListIterator -> backward direction (only List)
		System.out.print("\nlist = ");
		while(lt.hasPrevious()){
			System.out.print("\t"+lt.previous());
		}
	}
}