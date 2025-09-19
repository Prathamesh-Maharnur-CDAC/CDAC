class DoublyLinkedList{
	Node head;
	
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			next=prev=null;
		}
	}
	
	public void display(){
		Node n =head;
		
		while(n!=null){
			System.out.print(n.data+" <---> ");
			n=n.next;
		}
	}
	
	public void insert(int data){
		Node new_node = new Node(data);
		
		new_node.next=head;
		new_node.prev = null; // not required
		if(head!=null){  // if head already exist
			head.prev=new_node;
		}
		head=new_node;
	}
	
	public static void main(String[] args){
		DoublyLinkedList d1 = new DoublyLinkedList();
		d1.head = new Node(100);
		
		d1.insert(20);
		d1.insert(30);
		d1.insert(40);
		d1.insert(50);
		d1.insert(60);
		
		d1.display();
	}
}