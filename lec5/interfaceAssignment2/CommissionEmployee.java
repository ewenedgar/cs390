package interfaceAssignment2;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double CommisionRate;
	CommissionEmployee(String fname, String lName, String sSN, double grossSales,double commissionRate) {
		super(fname, lName, sSN);
		// TODO Auto-generated constructor stub
		this.grossSales = grossSales;
		this.CommisionRate = commissionRate;
	}
	public void setGrossSales(double gross) {
		this.grossSales = gross;
	}
	public void setCommisionRate(double rate) {
		this.CommisionRate = rate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public double getCommisionRate() {
		return CommisionRate;
	}
	@Override
	public double getPayment() {
		return grossSales * CommisionRate;
	}
	
	

}
