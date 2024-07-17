public class AtmMachine {

    TheBank firstAccount = new TheBank("Toheeb Afeez", "1234567890", "1234", 0);
    TheBank secondAccount = new TheBank("Ebuka Solar", "9876543210", "4321", 0);
    Account myAccount = new Account();

    public double deposit(double amount){
        myAccount.addToListOfAccounts(firstAccount);
        firstAccount.deposit(amount);
        return firstAccount.balance();
    }

    public double withdraw(double amount){
        firstAccount.withdraw(amount);
        return firstAccount.balance();
    }
    public double transfer(double amount, String accountNumber){
        firstAccount.transfer(amount, accountNumber);
        secondAccount.deposit(amount);
        return secondAccount.balance();
    }

    public double accountBalance(){
        firstAccount.balance();
        secondAccount.balance();
        return firstAccount.balance();
    }
}
