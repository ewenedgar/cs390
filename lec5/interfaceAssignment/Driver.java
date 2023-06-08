package interfaceAssignment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure[] fig = {new UpwardHat("UpwardHat"), new UpwardHat("UpwardHat"),
				new DownwardHat("DownwardHat"), new FaceMaker("FaceMaker"), new Verticle("Verticle")
		};
		
		for(Figure fi : fig) {
			System.out.print(fi.getName()+" : ");
			fi.getFigure();
		}
	
	}

}
