abstract class Account {
    private String accountNumber;
    protected double balance;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        balance += amount + interest;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

public class BankingApp_Q8 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA123", 5000, 5);
        Account current = new CurrentAccount("CA456", 3000, 1000);

        System.out.println("Initial Account Details:");
        savings.displayAccountDetails();
        current.displayAccountDetails();

        savings.deposit(1000);
        current.withdraw(3500);

        System.out.println("\nUpdated Account Details:");
        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}
