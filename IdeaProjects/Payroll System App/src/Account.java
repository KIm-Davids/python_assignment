import java.util.ArrayList;

public class Account {

    static ArrayList<String> storeAccounts = new ArrayList<>();
    static ArrayList<String> storeOldAccounts = new ArrayList<>();


    public void createAccount(String names, String phoneNumber, String identificationNumber, String employeeStatus, String companyName, String salary){
        storeAccounts.add(names);
        storeAccounts.add(phoneNumber);
        storeAccounts.add(identificationNumber);
        storeAccounts.add(employeeStatus);
        storeAccounts.add(companyName);
        storeAccounts.add(salary);
    }

    public void oldUserAccount(String name, String password){
            storeOldAccounts.add(name);
            storeOldAccounts.add(password);
    }

    public void balance(int balance){
        storeOldAccounts.add(String.valueOf(balance));
    }

    public ArrayList<String> getBalance(){
        return storeOldAccounts;
    }

    public static String salaryAmount(){
        return storeAccounts.get(5);
    }

    public String password(){
        return storeOldAccounts.get(1);
    }
    public static ArrayList<String> getEmployeeDetails(){
        return storeAccounts;
    }

    public static String getName(){
        return storeAccounts.get(0);
    }

    public static String getEmployeeStatus(){
        String employeeLevel = "";
        for(int counter = 0;counter < storeAccounts.size(); counter++){
            employeeLevel = storeAccounts.get(3);
        }
        return employeeLevel;
    }

    public static String getCompany(){
        return storeAccounts.get(4);
    }
//
//    public void name(){
//        return String.valueOf()
//    }
//    public void displayUserInfo(){
//        return String.valueOf("Employee Name: "+ storeAccounts)
//    }
}
