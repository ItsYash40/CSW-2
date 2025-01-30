package OOPs;

// Base class
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        double interestRate = 0.03; // Standard interest rate (3%)
        double interest = balance * interestRate;
        balance += interest;
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interestRate = 0.05; // Higher interest rate (5%)
        double interest = balance * interestRate;
        balance += interest;
        return balance;
    }
}

// Main class to demonstrate method overriding
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount standardAccount = new BankAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        System.out.println("Standard Account Balance after Interest: " + standardAccount.calculateInterest());
        System.out.println("Savings Account Balance after Interest: " + savingsAccount.calculateInterest());
    }
}
