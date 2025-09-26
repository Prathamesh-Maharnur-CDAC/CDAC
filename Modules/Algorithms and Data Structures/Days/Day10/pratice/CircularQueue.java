class CircularQueue{
	int size = 5;
	int[] CQ = new int[size];
	int front,rear;
	
	
	CircularQueue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return ((rear+1)%size == front);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Circular queue is full!!");
			return;
		}else{
			if(front == -1){
				front=0;
			}
			rear++;
			CQ[rear] = x;
			System.out.println(x+" : inserted");
		}
	}
	
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!!!");
			return 0;
		}else{
			int x = CQ[front];
			System.out.println(x+" : deleted");
			if(front == rear){
				front = -1;
				rear = -1;
			}else{
				front=(front+1)%size;	
			}
			return x;
		}
	}
	
	void display(){
		System.out.print("Circular Queue: ");
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}else{
			int i=front;
			while(i!=rear){
				System.out.print(CQ[i]+" ");
				i = (i+1)%size; // need to print rear explicitly outside while loop
				//i++; // works with this as well
			}
			System.out.print(CQ[i]+" ");
		}
	}
	
	public static void main(String[] args){
		CircularQueue q1 = new CircularQueue();
		
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