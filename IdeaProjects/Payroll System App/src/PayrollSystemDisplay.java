import java.util.Scanner;

public class PayrollSystemDisplay {

    Scanner input = new Scanner(System.in);
    Account employeeAccount = new Account();
    EmployeeLevel employeeLevel_ = new EmployeeLevel();

    public void frontPage(){
        String prompt = """
                GET TO KNOW YOUR SALARY DUE DATE
                
                1. LOGIN
                2. CREATE NEW ACCOUNT
                """;

        System.out.println(prompt);
        int options = input.nextInt();
        switch(options){
            case 1 -> logOldUser();
            case 2 -> login();
        }
    }

    public void logOldUser() {
        Account employeeAccount = new Account();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username ");
        String userName = input.nextLine();

        System.out.println("Enteer your password");
        String password = input.nextLine();

        employeeAccount.oldUserAccount(userName, password);
        employeeDisplayOptions();
    }

    public void login(){
        CreateAccountPage createAccount = new CreateAccountPage();

        createAccount.signUp();
        employeeDisplayOptions();
    }


    public void employeeDisplayOptions(){
        String employeeName = Account.getName();

        System.out.println("Hey " + employeeName);

        String prompt = """
                1. Check salary due date
                2. View Balance
                3. Check your profile
                """;
        System.out.println(prompt);
        int options = input.nextInt();
        switch(options){
            case 1 -> checkSalary();
//            case 2 ->
//            case 3 ->
        }
    }


    public void checkSalary(){
        Scanner input = new Scanner(System.in);
        System.out.println("To determine salary due:\nPlease fill in the details");

        System.out.println("What level of employment are you ?");
        String employeeLevel = input.next();

        System.out.println("Choose payment basis");
        String paymentBasis = input.next();

        System.out.println("How much do you earn ?");
        String employeeEarnings = input.next();

        String prompt = """
                On what basis do you earn ?
                
                1. -> Weekly
                2. -> Monthly
                3. -> Annually
               
                """;

        int options = input.nextInt();
        switch (options){
            case 1 -> weeklyPrompt();
            case 2 -> monthlyPrompt();
            case 3 -> yearlyPrompt();
        }
    }

    public void weeklyPrompt(){
        Scanner input = new Scanner(System.in);
        Account employeeAccount = new Account();
        String company = Account.getCompany();

        System.out.println("How long have you working in " + company);
        String workLength = input.next();

        System.out.println("How much are you currently earning ?");
        String earningAmount = input.next();

        System.out.println();

    }

    public void monthlyPrompt(){
        Scanner input = new Scanner(System.in);
        Account employeeAccount = new Account();
        String company = Account.getCompany();

        System.out.println("How long have you working in " + company);
        String workLength = input.next();

        System.out.println("How much are you currently earning ?");
        String earningAmount = input.next();

        System.out.println();

    }


    public void yearlyPrompt(){
        Scanner input = new Scanner(System.in);
        Account employeeAccount = new Account();
        String company = Account.getCompany();

        System.out.println("How long have you working in " + company);
        String workLength = input.next();

        System.out.println("How much are you currently earning ?");
        String earningAmount = input.next();

        System.out.println();

    }


    public void balancePage(){

        System.out.println("To check your password\n\nPlease enter your password");
        String password = input.next();

        if(password.equals(employeeAccount.password())){

        }

    }

    public void employeeBalance(){
        System.out.println("Your Account Balance is: " + employeeAccount.getBalance());
    }


    public void employerDisplayOptions(){
        String employeeName = Account.getName();

        System.out.println("Hey " + employeeName);

        String prompt = """
                1. Check salary due date
                2. View Balance
                3. Check your profile
                """;

        System.out.println(prompt);
        int options = input.nextInt();
//        switch(options){
//            case 1 ->
//            case 2 ->
//            case 3 ->
//        }
    }

    public void checkProfile(){
        System.out.println("Please confirm your compensation basis");
        String employeeOption = input.next();

        String prompt = """
                1 -> Daily Basis
                2 -> Weekly Basis
                3 -> Monthly Basis
                4 -> Yearly Basis
                
                """;
        System.out.println(prompt);
        int options = input.nextInt();

//        switch(options){
//            case 1 ->
//            case 2 ->
//            case 3 ->
//        }

    }


    public void dailyBasis(){
        EmployeeLevel employeeLevel = new EmployeeLevel();
        //System.out.println("Your daily income is: " + employeeLevel.weeklyCalculation());

    }





}
