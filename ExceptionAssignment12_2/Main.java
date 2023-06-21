package ExceptionAssignment12_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAccount ca = new CustomerAccount("edgar", 10, 500);
		System.out.println(ca.getBalance());
		System.out.println(ca.toString());
		try {
			System.out.println(ca.withdraw(600.0));
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (MinimumBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
