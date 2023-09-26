package tdd.bankapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

    public class BankAppGUI extends JFrame {
        private Bank bank;
        private JTextArea outputTextArea;

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                BankAppGUI app = new BankAppGUI();
                app.setVisible(true);
            });
        }

        public BankAppGUI() {
            bank = new Bank();

            setTitle("Americana Bank Application");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JLabel titleLabel = new JLabel("AMERICANA BANK PLC");
            titleLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(5, 1, 0, 10));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JButton createAccountBtn = new JButton("Create Account");
            createAccountBtn.addActionListener(e -> createAccount());

            JButton depositBtn = new JButton("Deposit");
            depositBtn.addActionListener(e -> deposit());

            JButton withdrawBtn = new JButton("Withdraw");
            withdrawBtn.addActionListener(e -> withdraw());

            JButton displayBalanceBtn = new JButton("Display Balance");
            displayBalanceBtn.addActionListener(e -> displayBalance());

            JButton exitBtn = new JButton("Exit");
            exitBtn.addActionListener(e -> System.exit(0));

            buttonPanel.add(createAccountBtn);
            buttonPanel.add(depositBtn);
            buttonPanel.add(withdrawBtn);
            buttonPanel.add(displayBalanceBtn);
            buttonPanel.add(exitBtn);

            outputTextArea = new JTextArea(10, 30);
            outputTextArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(outputTextArea);

            add(titleLabel, BorderLayout.NORTH);
            add(buttonPanel, BorderLayout.CENTER);
            add(scrollPane, BorderLayout.SOUTH);
        }

        private void createAccount() {
            String pinInput = JOptionPane.showInputDialog(this, "Enter PIN:");
            if (pinInput != null && !pinInput.isEmpty()) {
                int pin = Integer.parseInt(pinInput);
                String accountNumber = bank.createAccount(pin);
                JOptionPane.showMessageDialog(
                        this, "Account created! Your account number is " + accountNumber + ".");
            }
        }

        private void deposit() {
            String accountNumber = JOptionPane.showInputDialog(this, "Enter account number:");
            if (accountNumber != null && !accountNumber.isEmpty()) {
                double amount = Double.parseDouble(JOptionPane.showInputDialog(
                        this, "Enter deposit amount:"));
                boolean success = bank.deposit(accountNumber, amount);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Deposit successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found.");
                }
            }
        }

        private void withdraw() {
            String accountNumber = JOptionPane.showInputDialog(this, "Enter account number:");
            if (accountNumber != null && !accountNumber.isEmpty()) {
                int pin = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter PIN:"));
                double amount = Double.parseDouble(JOptionPane.showInputDialog(
                        this, "Enter withdrawal amount:"));
                boolean success = bank.withdraw(accountNumber, pin, amount);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Withdrawal successful!");
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance or incorrect PIN.");
                }
            }
        }

        private void displayBalance() {
            String accountNumber = JOptionPane.showInputDialog(this, "Enter account number:");
            if (accountNumber != null && !accountNumber.isEmpty()) {
                double balance = bank.getBalance(accountNumber);
                JOptionPane.showMessageDialog(
                        this, "Account balance: ₦" + String.format("%.2f", balance));
            }
        }
    }

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public String createAccount(int pin) {
        String accountNumber = Account.generateAccountNumber();
        Account newAccount = new Account(accountNumber, pin);
        accounts.put(accountNumber, newAccount);
        return accountNumber;
    }

    public boolean deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).deposit(amount);
        }
        return false;
    }

    public boolean withdraw(String accountNumber, int pin, double amount) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).withdraw(amount, pin);
        }
        return false;
    }

    public double getBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).getBalance();
        }
        return 0.0;
    }
}

class Account {
    private String accountNumber;
    private int pin;
    private double balance;

    public Account(String accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
    }

    public static String generateAccountNumber() {
        return " " + System.nanoTime();
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, int enteredPin) {
        if (amount > 0 && enteredPin == pin && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}