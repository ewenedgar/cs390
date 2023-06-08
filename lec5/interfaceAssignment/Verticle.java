package interfaceAssignment;

public class Verticle implements Figure {
	private String name;
	Verticle(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void getFigure() {
		System.out.println("||");
	}

}