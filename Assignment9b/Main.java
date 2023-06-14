package Assignment9b;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println(stack.pop() + " popped from the stack.");
        System.out.println(stack.pop() + " popped from the stack.");

        System.out.println("Top element: " + stack.peek());
    }

}
