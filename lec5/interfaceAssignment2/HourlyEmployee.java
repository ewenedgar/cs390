package interfaceAssignment2;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	HourlyEmployee(String fname, String lName, String sSN, double wage,double hours) {
		super(fname, lName, sSN);
		// TODO Auto-generated constructor stub
		this.wage = wage;
		this.hours = hours;
	}
	public void setWage(double gross) {
		this.wage = gross;
	}
	public void setHours(double rate) {
		this.hours = rate;
	}
	public double getWage() {
		return wage;
	}
	public double getHours() {
		return hours;
	}
	@Override
	public double getPayment() {
		return wage * hours;
	}
	
}
