package americana.bankapp;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double newBalance) {
        this.accountNumber = accountNumber;
        this.balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Depo");
        }
    }
}
