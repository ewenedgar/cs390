package interfaceAssignment;

public class FaceMaker implements Figure {
	private String name;
	FaceMaker(String name){
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
		System.out.println(":)");
	}
}