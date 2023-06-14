package Assignment9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue q = new ArrayQueue();
		q.display();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.display();
		System.out.println("Remove(): "+ q.dequeue());
		q.display();
		System.out.println("Remove(): "+ q.dequeue());
		q.display();
	}


}
