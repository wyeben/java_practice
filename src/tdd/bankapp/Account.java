//package tdd.bankapp;
//
//class Account {
//    private String accountNumber;
//    private int pin;
//    private double balance;
//
//    public Account(String accountNumber, int pin) {
//        this.accountNumber = accountNumber;
//        this.pin = pin;
//        this.balance = 0.0;
//    }
//
//    public static String generateAccountNumber() {
//        return "ACCT" + System.nanoTime();
//    }
//
//    public boolean deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean withdraw(double amount, int enteredPin) {
//        if (amount > 0 && enteredPin == pin && balance >= amount) {
//            balance -= amount;
//            return true;
//        }
//        return false;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//}
//
