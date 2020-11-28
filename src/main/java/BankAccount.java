public class BankAccount {

    final float maxDepositValuePerDay = 50000.00f;
    final float minDepositValue = 100.00f;
    public float balance;
    public boolean eligible;
    public int ID;

    public BankAccount(int ID, boolean eligible){
        this.ID = ID;
        this.balance = 0.00f;
        this.eligible = eligible;
    }

    public boolean check_Deposit_Amount_Per_Transaction(float amount){
        if(amount >= minDepositValue){
            return true;
        }
        else{
            return false;
        }
    }

    public void addBalance(float balance){
        this.balance += balance;
    }

    public boolean check_Deposit_Amount_Per_Day(float amount){
        if(amount <= 50000.00f){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean check_If_Account_Is_Eligible(int accountID){
        if(this.ID == accountID) {
            return this.eligible;
        }
        else{
            return false;
        }
    }
}
