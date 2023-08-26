package tdd.bankapp;

public class Account {
        private String firstName;
        private String secondName;
        private String accountNumber;
        private String accountDetail;
        private double balance;
        private int pin;

        public Account(String accountNumber, int pin) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
            this.pin = pin;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount, int Pin) {
            if (Pin == pin && amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

    public void register(String firstName, String secondName) {
            this.firstName = firstName;
        this.secondName = secondName;

    }

    public void setAccountNumber(String number) {
            this.accountNumber = number;

    }

    public String getAccountDetail() {
        this.accountDetail = firstName + " "+ secondName + " " + accountNumber;
        return accountDetail;
    }

}
