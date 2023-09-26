//import tdd.bankapp.BankApp;
//
//class Bank {
//    private Map<String, BankApp.Account> accounts;
//
//    public Bank() {
//        accounts = new HashMap<>();
//    }
//
//    public String createAccount(int pin) {
//        String accountNumber = BankApp.Account.generateAccountNumber();
//        BankApp.Account newAccount = new BankApp.Account(accountNumber, pin);
//        accounts.put(accountNumber, newAccount);
//        return accountNumber;
//    }
//
//    public boolean deposit(String accountNumber, double amount) {
//        if (accounts.containsKey(accountNumber)) {
//            return accounts.get(accountNumber).deposit(amount);
//        }
//        return false;
//    }
//
//    public boolean withdraw(String accountNumber, int pin, double amount) {
//        if (accounts.containsKey(accountNumber)) {
//            return accounts.get(accountNumber).withdraw(amount, pin);
//        }
//        return false;
//    }
//
//    public double getBalance(String accountNumber) {
//        if (accounts.containsKey(accountNumber)) {
//            return accounts.get(accountNumber).getBalance();
//        }
//        return 0.0;
//    }
//}