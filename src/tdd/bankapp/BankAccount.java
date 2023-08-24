package tdd.bankapp;

public class BankAccount {
        private String accountNumber;
        private double balance;
        private int pin;

        public BankAccount(String accountNumber, int pin) {
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
    }
