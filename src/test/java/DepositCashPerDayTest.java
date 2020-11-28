import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {

    @Test
    void deposit_Less_Than_50000_Per_Day_Result_Should_Be_True() {
        // Arrange
        float balance1 = 30000.00f;
        float balance2 = 14000.00f;
        boolean expectedResult = true;
        BankAccount person1 = new BankAccount(001, true);
        person1.addBalance(balance1);
        person1.addBalance(balance2);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Day(balance1 + balance2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Equal_To_50000_Per_Day_Result_Should_Be_True() {
        // Arrange
        float balance1 = 30000.00f;
        float balance2 = 20000.00f;
        boolean expectedResult = true;
        BankAccount person1 = new BankAccount(001, true);
        person1.addBalance(balance1);
        person1.addBalance(balance2);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Day(balance1 + balance2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_More_Than_50000_Per_Day_Result_Should_Be_False() {
        // Arrange
        float balance1 = 30000.00f;
        float balance2 = 30000.00f;
        boolean expectedResult = false;
        BankAccount person1 = new BankAccount(001, true);
        person1.addBalance(balance1);
        person1.addBalance(balance2);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Day(balance1 + balance2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
