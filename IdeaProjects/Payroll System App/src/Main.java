public class Main {
    public static void main(String[] args) {
        CreateAccountPage employeeAccount = new CreateAccountPage();
        Account employee = new Account();
        PayrollSystemDisplay display = new PayrollSystemDisplay();
        display.frontPage();

        employeeAccount.signUp();

        System.out.println(Account.getEmployeeDetails());
        System.out.println(Account.getEmployeeStatus());
    }
}