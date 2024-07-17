import java.lang.reflect.Array;
import java.util.Arrays;

public class TheBank {

    private String name;
    private String accountNumber;
    private String pin;
    private double balance;
    private Account myAccount = new Account();


    public TheBank(String name, String accountNumber, String pin, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double deposit){
        if(!(deposit < 0)) {
            this.balance += deposit;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount < balance){
            this.balance -= amount;
        }
    }

    public double transfer(double amount, String accountNumber){


        Account myAccount = new Account();
            for(TheBank accounts : myAccount.getAccount()){
            if (accountNumber.equalsIgnoreCase(accounts.accountNumber)){
                withdraw(amount);

            }
        }
       return 0.0;
    }

    public double balance(){
        return this.balance;
    }

    public String toString(){
        return "Name: " + name + " Account Number: " + accountNumber + " Account Balance = " + balance;
    }

}
