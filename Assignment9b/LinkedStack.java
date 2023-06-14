package Assignment9b;


public class LinkedStack {

	class Node{
		int data;
		Node next;	
		Node(int item){
			data = item;
			next = null;
		}
		
	}
	//Node next;
	Node top = null;
	

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	        System.out.println(data + " pushed to the stack.");
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return -1;
	        }
	        int data = top.data;
	        top = top.next;
	        return data;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return -1;
	        }
	        return top.data;
	    }
	

}
