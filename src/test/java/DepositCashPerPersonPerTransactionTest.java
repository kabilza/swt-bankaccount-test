import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerPersonPerTransactionTest {

    @Test
    void deposit_Less_Than_30000_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCashNumber = 5000.00f;
        DepositCash depositCashClass = new DepositCash();

        // Act
        boolean actualResult = depositCashClass.checkDepositPerTransaction(depositCashNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Equal_To_30000_Result_Should_Be_True() {
        // Arrange
        boolean expectedResult = true;
        float depositCashNumber = 30000.00f;
        DepositCash depositCashClass = new DepositCash();

        // Act
        boolean actualResult = depositCashClass.checkDepositPerTransaction(depositCashNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_More_Than_30000_Result_Should_Be_False() {
        // Arrange
        boolean expectedResult = false;
        float depositCashNumber = 32000.00f;
        DepositCash depositCashClass = new DepositCash();

        // Act
        boolean actualResult = depositCashClass.checkDepositPerTransaction(depositCashNumber);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
