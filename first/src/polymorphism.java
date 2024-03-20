class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class InvestmentAccount extends Account {
    private double annualInterestRate;

    public InvestmentAccount(double balance, double annualInterestRate) {
        super(balance);
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * annualInterestRate / 100;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(3000, 1000);
        InvestmentAccount investmentAccount = new InvestmentAccount(10000, 5);

        savingsAccount.deposit(1000);
        checkingAccount.withdraw(200);
        investmentAccount.deposit(3000);

        System.out.println("Savings Account Balance: Rs " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: Rs " + checkingAccount.getBalance());
        System.out.println("Investment Account Balance: Rs " + investmentAccount.getBalance());
        System.out.println("Interest earned on Savings Account: Rs " + savingsAccount.calculateInterest());
        System.out.println("Interest earned on Investment Account: Rs " + investmentAccount.calculateInterest());
    }
}
