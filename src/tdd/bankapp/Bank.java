package tdd.bankapp;



public class Bank {
    private String name;
    private Account account;

    public Bank(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccounts() {
        return account;
    }

    public void setAccounts(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
