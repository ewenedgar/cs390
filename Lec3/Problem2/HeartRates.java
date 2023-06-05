package Problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String firstName;
	private String lastName;
	private LocalDate DOB = LocalDate.now();
	
	final int RHR = 70;
	final double LB = 0.5;
	final double UB = 0.85;
	double LBTHR = AHR()*LB + RHR;
	double UBTHR = (AHR()*UB) + RHR;
	
	HeartRates(String firstName, String lastName, LocalDate DOB){
		this.firstName = firstName;
		this.lastName = lastName;
		this.DOB = DOB;
	}
	
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setDOB(LocalDate DOB) {
		this.DOB = DOB;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	
	public int ageYears(LocalDate DOB) {
		LocalDate nw = LocalDate.now();
		int years = Period.between(getDOB(), nw).getYears();
		 	 	    
		return years;
	}
	
	public int MHR() {
		
		return 220 - ageYears(DOB);		
	}
	
	public String THR() {
		return "The target heart Rate is between " + LBTHR
				+" and "+ UBTHR ;
		
	}
	
	public double AHR() {
		return MHR() - RHR;
		
	}

	public String toString() {
		return "\n First Name: "+firstName +"\n Last Name: "+
	lastName + "\n Date Of Birth: "+ DOB + " Age: "+ ageYears(DOB)+
	"\n Maximum Heart Rate: " + MHR();
		
	}
	

}
