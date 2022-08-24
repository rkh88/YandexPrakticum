package BankAccount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        BankAccount account = new BankAccount("a", "b");
        account.block();;
        assertTrue(account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("a", "b");
        String[] array = account.getFullName();
        String[] names = {"a", "b"};
        assertTrue(Arrays.equals(array, names));
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        BankAccount account = new BankAccount("a", "b");
        final IllegalStateException exception = assertThrows(

                IllegalStateException.class,
                new Executable() {
                    @Override
                    public void execute() {
                        account.getAmount();
                    }
                });
        assertNull(account.getCurrency());
        assertEquals("Счёт не активирован.", exception.getMessage());
    }
}
