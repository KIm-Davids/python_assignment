public class Banke {

    private String name;
    private long accountNumber;
    private int pin;

    public void setName(String name){
        this.name =name;
    }

    public String getName(){
        return name;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getPin(){
        return pin;
    }
}