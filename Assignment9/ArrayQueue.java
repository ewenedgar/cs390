package Assignment9;

public class ArrayQueue {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	public int peek() {
		if(front == -1) {
			System.out.println("Queue is empty: ");
			return -1;
		}
		
	return arr[front];
	//implement
	}
	public void enqueue(int obj){
	//implement
		if(front == -1) {
			front++;
			arr[0] = obj;
			
		}
		
		else {
			if(rear == arr.length) resize();
			arr[++rear] = obj;
			
		}
	}
	public int dequeue() {
		if(front == -1) {
			System.out.println("Queue is empty: ");
			return -1;
		}
		if(front == rear) return -1;
		int a = arr[front];
		arr[front] = -1;
		front++;
	return a;
	//implement
	}
	public boolean isEmpty(){
		
	//implement
	return (front <= 0 && rear == 0);
	}
	public int size(){
	//implement
		if(front == -1) return 0;
	return rear - front;
	}
	 private void resize(){
	//implement
		 int[] newArray = new int[arr.length * 2];
	      System.arraycopy(arr, 0, newArray, 0, 3);
	      arr = newArray;
	      
	}
	 public void display() {
			int count = front;
			System.out.print("Linked Q: ");
			if(front == -1) {
				System.out.println("empty");
				return;
			}
			while( count <= rear) {
				System.out.print(arr[count] + " ");
				count++;
			}
			System.out.println();
			
		}
}
