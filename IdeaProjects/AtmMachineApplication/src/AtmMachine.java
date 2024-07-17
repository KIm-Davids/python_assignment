public class AtmMachine {

    private String name;
    private int pin;
    private double balance;
    private double deposit;
    private double withdraw;
    private double transferAmount;
    private String newAccount;
    private String thirdUserName;
    private double thirdUserBalance;
    private String thirdUserAccountNumber;
    private int thirdUserPin;

    public void AtmMachine(String name, String thirdUserAccountNumber, int pin){
        this.name = name;
        this.thirdUserAccountNumber = thirdUserAccountNumber;
        this.pin = pin;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getPin(){
        return pin;
    }

    public void setBalance(double balance){
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setUpdatedAmount(double newAmount){
        this.balance = balance - newAmount;

    }

    public double getNewAmount(){
        return balance;
    }

    public void setDeposit(double deposit){
        if(deposit > 0.0){
            this.balance += deposit;
        }
    }

    public double getDeposit(){
        return deposit;
    }

    public void setWithdraw(double withdraw){

        this.balance -= withdraw;
    }

    public double getWithdraw(){
        return withdraw;
    }

    public void setsecondUser(double transferAmount){
        this.balance = balance - transferAmount;
    }

    public double gettransferAmount(){
        return transferAmount;
    }


    public String getAccountNumber(){
        return newAccount;
    }

    public void setThirdUser(String thirdUser){
        this.thirdUserName = thirdUser;
    }

    public String getthirdUser(){
        return thirdUserName;
    }

    public void setThirdUserBalance(double thirdInput){
        this.thirdUserBalance = thirdUserBalance + thirdInput;
    }

    public double getThirdBalance(){
        return thirdUserBalance;
    }

    public void setnewUserAccountNumber(String thirdUserAc){
        this.thirdUserAccountNumber = thirdUserAc;
    }

    public String getthirdUserAccountNumber(){
        return thirdUserAccountNumber;
    }

    public void setNewUserPin(int inputPin){
        this.thirdUserPin = inputPin;
    }

    public int getThirdUserPin(){
        return thirdUserPin;
    }


}







