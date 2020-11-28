import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfAccountIsEligibleTest {

    @Test
    public void test_Eligible_Account_Should_Return_True(){
        // Arrange
        int ID = 020223;
        boolean eligible_value = true;
        boolean expectedResult = true;
        BankAccount person1 = new BankAccount(ID, eligible_value);

        // Act
        boolean actualResult = person1.check_If_Account_Is_Eligible(ID);

        // Assert
        assertEquals(expectedResult, actualResult);
    };

    @Test
    public void test__Non_Eligible_Account_Should_Return_False(){
        // Arrange
        int ID = 020225;
        boolean eligible_value = false;
        boolean expectedResult = false;
        BankAccount person1 = new BankAccount(ID, eligible_value);

        // Act
        boolean actualResult = person1.check_If_Account_Is_Eligible(ID);

        // Assert
        assertEquals(expectedResult, actualResult);
    };
}
