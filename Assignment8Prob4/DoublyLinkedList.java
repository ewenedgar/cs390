package Assignment8Prob4;

public class DoublyLinkedList {
	class Node {
		String value;
		Node next;
		Node prev;
		
		Node(String data){
			this.value  = data;
			this.next = this.prev = null;
		}
		public String toString() {
			
			return value == null ? "null" : value;
		}
	}

	Node header, tail;
	String data;
	DoublyLinkedList(){
		header = null;
		tail = null;
	}
	//adds to the end of the list
	public void addLast(String s){
		//implement
		Node newNode = new Node(s);

        if (header == null) {
            header = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
		
	}
	public boolean remove(String s){

		//Implement
		if (header == null) {
            return false;
        }

        if (header.value.equals(s)) {
            if (header == tail) {
                header = null;
                tail = null;
            } else {
                header = header.next;
                header.prev = null;
            }
            return true;
	}
        Node current = header;
        while (current != null && !current.value.equals(s)) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        return true;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();
		
	}
	private void toString(StringBuilder sb, Node n) {
		if(n==null) return;
		if(n.value != null) sb.append(" " + n.value);
		toString(sb, n.next);
	}
	
	
	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		System.out.println(list);
		
		boolean removed = list.remove("Bill");
        System.out.println("Element removed: " + removed); 

        list.addLast("Carol");
        System.out.println(list); 

        
        boolean removed2 = list.remove("Carol");
        System.out.println("Element removed: " + removed2); 
    
        System.out.println(list);
	}
}
