class Queue{
	
	int size = 5;
	int[] Q = new int[size];
	int front,rear =-1;
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full");
		}else{
			if(front == -1){
				front = 0;
			}
			rear++;	
			Q[rear] = x;
			System.out.println(x+" : inserted");
		}
	}
	
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!!!");
			return 0;
		}else{
			int x = Q[front];
			System.out.println(x+" : deleted");
			if(front > rear){
				front = -1;
				rear = -1;
			}else{
				front++;
			}
			return x;
		}
	}
	
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			System.out.print("Queue: ");
			for(int i=front;i<=rear;i++){
				System.out.print(Q[i]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args){
		
		Queue q1 = new Queue();
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);
		q1.enqueue(70);
		System.out.println("-------------------------------------------");
		
		System.out.println("After enqueue: ");
		q1.display();
		
		System.out.println("-------------------------------------------");
		q1.dequeue();
		q1.dequeue();
		
		System.out.println("-------------------------------------------");
		System.out.println("After dequeue: ");
		q1.display();
		
		
	}
}