package interfaceAssignment2;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	SalariedEmployee(String fname, String lName, String sSN, double weeklySalary) {
		super(fname, lName, sSN);
		// TODO Auto-generated constructor stub
		this.weeklySalary = weeklySalary;
		
	}
	public void setGrossSales(double gross) {
		this.weeklySalary = gross;
	}
	
	public double getGrossSales() {
		return weeklySalary;
	}
	
	@Override
	public double getPayment() {
		return weeklySalary ;
	}
	
}
