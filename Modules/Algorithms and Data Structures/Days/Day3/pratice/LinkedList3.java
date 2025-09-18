class LinkedList3{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ---> ");
			n = n.next;
		}
	}
	
	void insert(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public static void main(String[] args){
		LinkedList3 l3 = new LinkedList3();
		
		l3.head = new Node(100);
		
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l3.head.next = second;
		second.next = third;
		third.next = fourth;
		
		l3.display();
		
		l3.insert(12);
		System.out.println("\nAfter adding 12: ");
		l3.display();
		
		l3.insert(13);
		System.out.println("\nAfter adding 12: ");
		l3.display();
		
		l3.insert(14);
		System.out.println("\nAfter adding 12: ");
		l3.display();
		
	}
}