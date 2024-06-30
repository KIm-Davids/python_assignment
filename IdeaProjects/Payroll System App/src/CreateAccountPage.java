import java.util.Scanner;

public class CreateAccountPage extends Account {
    static Scanner input = new Scanner(System.in);
    static Account employeeAccount = new Account();


    public void signUp(){
        System.out.println("Enter your Name");
        String name = input.next();

        System.out.println("Enter your phone number");
        String phoneNumber = input.next();

        input.next();

        System.out.println("Enter your BVN or NIN");
        String identification = input.next();

        System.out.println("Enter your employee status");
        String employeeStatus = input.next();

        System.out.println("Enter your company name");
        String companyName = input.next();

        System.out.println("Please enter your salary amount");
        String salary = input.next();

        employeeAccount.createAccount(name,phoneNumber,identification,employeeStatus,companyName, salary);
    }
}
