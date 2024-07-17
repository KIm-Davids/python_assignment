public class NewUserAccount{

    private String userName;
    private long userAccountNumber;
    private int userPin;
    private double userBalance;
    private double withdrawAmount;
    private double transferAmount;



    public void setName(String name){
        this.userName = name;
    }

    public void setAccountNumber(long accountNumber){
        this.userAccountNumber = accountNumber;
    }

    public void setPin(int pin){
        this.userPin = pin;
    }

    public void setUserBalance(double addAccountBalance){
        this.userBalance = userBalance + addAccountBalance;
    }

    public void setWithdraw(double withdrawAmount){
        this.userBalance = userBalance - withdrawAmount;
    }

    public void setTransfer(double transferAmount){
        this.userBalance = userBalance - transferAmount;
    }

    public void setBalance(double balance){
        if(balance > 0.0){
            this.userBalance = balance;
        }
    }

    public double getTransfer(){
        return transferAmount;
    }

    public double getWithdraw(){
        return withdrawAmount;
    }

    public double getUserBalance(){
        return userBalance;
    }
    public String getUserName(){
        return userName;
    }

    public long getUserAccountNumber(){
        return userAccountNumber;
    }

    public int getUserPin(){
        return userPin;
    }
    public String toString(){
        return String.format("User ACcount Name: %s%n User Account Number: %l%n User Balance: %d%n",getUserName(),getUserAccountNumber(), getUserBalance());
    }
}
