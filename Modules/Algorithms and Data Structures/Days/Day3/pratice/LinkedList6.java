class LinkedList6{
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
	
	
	void delete(int key){
		
		Node temp=head,prev_node=null;
		// delete head node
		// temp!= null to check is the element exists
		if(temp!= null && temp.data == key){
			head = temp.next;
			return;
		}
		
		//delete in between or last node
		while(temp!=null && temp.data!= key){
			prev_node = temp;
			temp = temp.next;
		}
		if(temp == null){
			return;
		}
		prev_node.next = temp.next;
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ---> ");
			n = n.next;
		}
	}
	
	public static void main(String[] args){
		LinkedList6 l6 = new LinkedList6();
		l6.head = new Node(100);
		
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l6.head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("\nOriginal list: ");
		l6.display();
		
		l6.insert(11);
		System.out.println("\nAfter inserting 11 at the head: ");
		l6.display();
		
		l6.insertAfter(l6.head.next.next,12);
		System.out.println("\nAfter inserting 12 at the head.next.next: ");
		l6.display();
		
		l6.append(13);
		System.out.println("\nAfter inserting 13 at the end: ");
		l6.display();
		
		System.out.println("\n*****************************************************************************");
		l6.delete(11);
		System.out.println("\nAfter deleting 11 at the head: ");
		l6.display();
		
		
		l6.delete(30);
		System.out.println("\nAfter deleting 30 in between: ");
		l6.display();
		
		l6.delete(13);
		System.out.println("\nAfter deleting 13 at the end: ");
		l6.display();
	}
}