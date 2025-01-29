public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("The balance is 0 ");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Deposit amount must be positive number ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: Rs." + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }
    public double checkBalance() {
        return balance;
    }
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Holder: " + accountHolderName;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("12345", "John Doe", 1500.00);

        System.out.println("Initial Balance: Rs." + myAccount.checkBalance());

        myAccount.deposit(250.00);
        System.out.println("Balance after deposit: Rs." + myAccount.checkBalance());

        myAccount.withdraw(100.00);
        System.out.println("Balance after withdrawal:Rs." + myAccount.checkBalance());

        myAccount.withdraw(1000.00);  
        System.out.println("Balance after failed withdrawal: Rs." + myAccount.checkBalance());
    }
}








