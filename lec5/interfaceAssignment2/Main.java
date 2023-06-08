package interfaceAssignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = {new BasePlusCommisionEmployee(
				"Base", "Plus", "121-313", 10, 200, 3000),
				new CommissionEmployee("Commission", "Egwen", "121-313", 30, 200),
				new HourlyEmployee("Hourly", "Etan", "121-313", 20, 400),
				new SalariedEmployee("Salaried", "Ewen", "121-313", 7000)			
		};
		
		for(Employee em: emp) {
			System.out.println(em.toString() +"  "+em.getPayment());
		}
		
	}

}
