package interfaceAssignment;

public class DownwardHat implements Figure {
	private String name;
	DownwardHat(String name){
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
		System.out.println("\\/");
	}

}