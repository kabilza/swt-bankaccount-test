import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfTransactionMoreThanMinTest {

    @Test
    public void transaction_Equal_To_Min_Should_Return_true(){
        // Arrange
        boolean expectedResult = true;
        float depositAmount = 100.00f;
        BankAccount person1 = new BankAccount(001, true);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Transaction(depositAmount);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void transaction_More_Than_Min_Should_Return_true(){
        // Arrange
        boolean expectedResult = true;
        float depositAmount = 250.00f;
        BankAccount person1 = new BankAccount(001, true);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Transaction(depositAmount);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void transaction_Less_Than_Min_Should_Return_false(){
        // Arrange
        boolean expectedResult = false;
        float depositAmount = 50.00f;
        BankAccount person1 = new BankAccount(001, true);

        // Act
        boolean actualResult = person1.check_Deposit_Amount_Per_Transaction(depositAmount);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
