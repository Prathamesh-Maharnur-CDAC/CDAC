class LinkedList1{
	
	Node head;
	
	
	static class Node{
		int data;
		Node next;
		
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	

	 public static void main(String[] args){
		LinkedList1 l1 = new LinkedList1();
		
		l1.head = new Node(100);
		Node second  = new Node(30);
		Node third = new Node(40);
		Node fourth = new Node(50);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
	}
}