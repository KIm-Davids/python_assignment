import java.util.ArrayList;

public class Account {

    private ArrayList<TheBank> theBank = new ArrayList<>();

    public void addToListOfAccounts(TheBank myTheBank){
        this.theBank.add(myTheBank);
    }

    public ArrayList<TheBank> getAccount(){
        return theBank;
    }

    public String getAccountNumber(String accountNumber){
        String accounts = "";
        for(Object accountNo : theBank.toArray()){
            return accountNo.toString();
        }
        return accounts;
    }

    public String toString(){
        for(Object accountIn : theBank.toArray()) return " " + accountIn.toString();
        return theBank.toString();
    }

}
