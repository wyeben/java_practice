package tdd.bankapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setup() {
        account = new Account("1", 1);
    }

    @Test
    public void checkInitialBalance() {
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void canDepositMoney() {
        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void canWithdrawSufficientFunds() {
        account.deposit(2000.0);
        assertTrue(account.withdraw(1000.0, 1));
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void canNotWithdrawInsufficientFunds() {
        account.deposit(500.0);
        assertFalse(account.withdraw(1000.0, 1));
        assertEquals(500.0, account.getBalance());
    }

    @Test
    public void canNotWithdrawWithIncorrectPin() {
        account.deposit(2000.0);
        assertFalse(account.withdraw(1000.0, 3));
        assertEquals(2000.0, account.getBalance());
    }

    @Test
    public void checkAccountNumber() {
        assertEquals("1", account.getAccountNumber());
    }

    @Test
    public void registerAnAccount(){
        account.register("Yila", "Benson");
        account.setAccountNumber("12243645");
        assertEquals("Yila Benson 12243645",account.getAccountDetail());

    }
}
