class LinkedList5{
	// LinkedList should know its head for accesing
	Node head;
	
	// no need to create object of Node class because of 'static'
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}

	void insert(int data){
		// add at the head position
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	void insertAfter(Node prev_node,int data){
		// if element does not exist
		if(prev_node == null){
			System.out.println("prev_node cannot be null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	void append(int data){
		
		Node new_node = new Node(data);
		// if list is empty
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = null;
		
		// iteratie till we get the next is null inorder to insert at end
		Node last=head; 
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ---> ");
			n = n.next;
		}
	}
	
	public static void main(String[] args){
		LinkedList5 l5 = new LinkedList5();
		l5.head = new Node(100);
		
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l5.head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("\nOriginal list: ");
		l5.display();
		
		l5.insert(11);
		System.out.println("\nAfter inserting 11 at the head: ");
		l5.display();
		
		l5.insertAfter(l5.head.next.next,12);
		System.out.println("\nAfter inserting 12 at the head.next.next: ");
		l5.display();
		
		l5.append(13);
		System.out.println("\nAfter inserting 13 at the end: ");
		l5.display();
		
	}
}