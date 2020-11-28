public class DepositCash {

    //Q3 send argument as BankAccount number and check if the account is being
    //suspended or not

    final float maxDepositValue = 30000.00f;
    final float minDepositValue = 100.00f;

    public boolean checkDepositPerTransaction(float number){
        if(number <= maxDepositValue){
            return true;
        }
        else{
            return false;
        }
    };

    public boolean checkMaxDepositAmountPerDay(float number){
        if(number <= minDepositValue){
            return true;
        }
        else{
            return false;
        }
    };
}
