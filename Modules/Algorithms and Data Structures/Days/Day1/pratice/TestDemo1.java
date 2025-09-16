import java.util.ArrayList;

class TestDemo1{

	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
		
		// Add an element
		list.add("Apple");
		list.add("Banana");
		list.add("Chickoo");
		System.out.println("List = "+list);
		
		
		// update the element
		list.set(1,"Cherry");
		System.out.println("After updating index 1 to cherry:\n\tlist = "+list);
		
		// Remove by index
		list.remove(2);
		System.out.println("After removing index 2 from list:\n\tlist = "+list);
		
		
		// Remove the element by value
		list.remove("Cherry");
		System.out.println("After removing Cherry from list:\n\tlist = "+list);
		
		System.out.println("Display list:\n\tlist = "+list);
	}
}