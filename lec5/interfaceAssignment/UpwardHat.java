package interfaceAssignment;

public class UpwardHat implements Figure {
	private String name;
	UpwardHat(String name){
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
		System.out.println("/\\");
	}

}
