package interfaceAssignment2;

public class BasePlusCommisionEmployee extends CommissionEmployee {
	private double baseSalary;
	BasePlusCommisionEmployee(String fname, String lName, String sSN,
			double grossSales,double commissionRate, double baseSalary) {
		super(fname, lName, sSN, grossSales,commissionRate );
		// TODO Auto-generated constructor stub
		
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double rate) {
		this.baseSalary = rate;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	@Override
	public double getPayment() {
		return baseSalary + (super.getGrossSales() * super.getCommisionRate());
	}
	
}
