class LinkedList{
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
	
	void insertAfter(Node prev_node,int data){
		Node new_node = new Node(data);
		
		if(prev_node == null){
			System.out.println("prev_node does not exist");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	void append(int data){
		Node new_node = new Node(data);
		
		if(head==null){
			head=new_node;
			return;
		}
		
		Node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
	}
	
	void delete(int key){
		Node temp = head;
		Node prev = null;
		
		
		if(temp!=null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null){
			return;
		}
		prev.next = temp.next;
	}
	
	public int count(){
		Node n = head;
		int count=0;
		while(n!=null){
			n = n.next;
			count++;
		}
		return count;
	}
	
	public int recursiveCount(Node n){
		if(n==null){
			return 0;
		}
		return 1+recursiveCount(n.next);
	}
	
	public  boolean search(Node n,int key){
		while(n!=null){
			if(n.data == key){
				return true;
			}
			n=n.next;
		}
		return false;
		
	}
	
	public void display2(Node n){
		
		while(n!=null){
			System.out.print(n.data+" ---> ");
			n = n.next;
		}
	}
	
	
	public Node reverse(Node n){
		Node prev=null;
		Node curr=n;
		Node next=null;
		
		while(curr!=null){
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		n=prev;
		return n;
	}
	
	public Node middleNode(){
		Node slow,fast;
		slow=fast=head;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public void displayNodeData(Node n){
		System.out.println(n.data);
	}
	
	
	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		l1.head = new Node(100);
		
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l1.head.next = second;
		second.next = third;
		third.next = fourth;		
		
		System.out.println("\nOriginal list: ");
		l1.display();
		
		l1.insert(11);
		System.out.println("\nAfter inserting 11 at the head: ");
		l1.display();
		
		l1.insertAfter(l1.head.next.next,12);
		System.out.println("\nAfter inserting 12 at the head.next.next: ");
		l1.display();
		
		l1.append(13);
		System.out.println("\nAfter inserting 13 at the end: ");
		l1.display();
		
		System.out.println("\n*****************************************************************************");
		l1.delete(11);
		System.out.println("\nAfter deleting 11 at the head: ");
		l1.display();
		
		
		l1.delete(30);
		System.out.println("\nAfter deleting 30 in between: ");
		l1.display();
		
		l1.delete(13);
		System.out.println("\nAfter deleting 13 at the end: ");
		l1.display();
		
		
		System.out.println("\n*****************************************************************************");
		System.out.println("Count of node = "+l1.count());
		System.out.println("Count of node(recursive) = "+l1.recursiveCount(l1.head));
		
		
		System.out.println("\n*****************************************************************************");
		System.out.println("Search 20: "+l1.search(l1.head,20));
		System.out.print("Reverse: ");
		l1.head = l1.reverse(l1.head);
		l1.display2(l1.head);
		
		System.out.println("\n*****************************************************************************");
		System.out.print("Middle node: ");
		l1.displayNodeData(l1.middleNode());
		
		l1.insert(120);
		System.out.println("\nAfter inserting 120 at the head: ");
		l1.display();
		System.out.print("\nMiddle node: ");
		l1.displayNodeData(l1.middleNode());
	
		
	}

}