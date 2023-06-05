package Problem3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr;
		Circle  ci;
		Rectangle rt;
		
		Scanner sn = new Scanner(System.in);
		String ch;
		
			System.out.println("Enter C for circle \n Enter T for Triangle \n Enter R for Rectangle ");
			ch = sn.nextLine();
			if(ch.equals("C")) {
				System.out.println("Enter the radius of the Circle: ");
				double r = sn.nextDouble();
				ci = new Circle(r);
				System.out.println("Area of Circle is: "+ ci.computeArea());
								
			}else if(ch.equals("R")) {
				System.out.println("Enter the length of the Rectangle: ");
				double len = sn.nextDouble();
				System.out.println("Enter the height of the Rectangle: ");
				double ht = sn.nextDouble();
				
				rt = new Rectangle(len, ht);
				System.out.println("Area of Rectangle is: "+ rt.computeArea());
				
			}else if(ch.equals("T")) {
				System.out.println("Enter the base of the Triangle: ");
				double bas = sn.nextDouble();
				System.out.println("Enter the height of the Triangle: ");
				double ht = sn.nextDouble();
				
				tr = new Triangle(bas, ht);
				System.out.println("Area of Triangle is: "+ tr.computeArea());
				
			}else {
				System.out.println("None available: ");
			}
			
			sn.close();
		

	}

}
