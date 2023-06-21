package ExceptionAssignment12_2;

public class CustomerAccount {
    private String cus_name;
    private int acc_No;
    private double balance;

    public CustomerAccount(String cus_name, int acc_No, double balance) {
        this.cus_name = cus_name;
        this.acc_No = acc_No;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) throws InsufficientBalanceException, MinimumBalanceException {
        if (amount < 0) {
            return false;
        }
        
        if (balance - amount < 0) {
            throw new InsufficientBalanceException("Withdraw amount exceeds the balance.");
        } else if (balance - amount < 100) {
            throw new MinimumBalanceException("Balance will reach below $100 after withdrawal.");
        } else {
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }
}