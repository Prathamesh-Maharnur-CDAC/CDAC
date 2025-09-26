class Node{
	int data;
	Node next;
	
	
	Node(int data){
		this.data=data;
	}
}

class StackDemo1{
	Node head;
	
	StackDemo1(){
		this.head=null;
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	void push(int data){
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	void pop(){
		if(isEmpty()){
			System.out.println("StackUnderflow!!!");
			return;
		}
		
		Node temp = head;
		head = head.next;
		temp.next=null;
		temp=null;
	}
	
	int peek(){
		if(!isEmpty()){
			return head.data;
		}else{
			System.out.println("StackUnderflow!!!");
			return 0;
		}
	}
	
	public static void main(String[] args){
		StackDemo1 s = new StackDemo1();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println("Before pop(): "+s.peek()+" peek element");
		s.pop();
		System.out.println("After pop(): "+s.peek()+" peek element");
		
		System.out.println("Before pop(): "+s.peek()+" peek element");
		s.pop();
		System.out.println("After pop(): "+s.peek()+" peek element");
		
		System.out.println("Before pop(): "+s.peek()+" peek element");
		s.pop();
		System.out.println("After pop(): "+s.peek()+" peek element");
		
		
		System.out.println("Before pop(): "+s.peek()+" peek element");
		s.pop();
		System.out.println("After pop(): "+s.peek()+" peek element");
	}
}