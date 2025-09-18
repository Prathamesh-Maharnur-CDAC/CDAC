class LinkedList4{
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
		head  = new_node;
	}
	
	void insertAfter(Node prev_node,int data){
		if(prev_node == null){
			System.out.println("prev_node cannot be null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	
	public static void main(String[] args){
		
		LinkedList4 l4 = new LinkedList4();
		
		l4.head = new Node(100);
		
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l4.head.next = second;
		second.next = third;
		third.next = fourth;
		
		l4.insert(11);
		System.out.println("After inserting 11: ");
		l4.display();
		
		l4.insertAfter(l4.head.next,67);
		System.out.println("\nAfter inserting 67 in between: ");
		l4.display();
	}
}