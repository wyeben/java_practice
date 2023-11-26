package americana.bankapp;

public class Account {
    private String accountNumber;
    private double balance;
    private

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

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful");
        }else {
            System.out.println("Amount must be greater than zero");
        }
    }

    public void withdraw(double amount){
        if(balance > amount){
            balance -= amount;
            System.out.println("Withdrawal successful");
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        Account account = new Account("243646", 0.0);

        account.deposit(200);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
