import java.util.Random;
import java.util.Scanner;
public class AtmMachineFinalVersion {
    private static NewUserAccount newUserAccount = new NewUserAccount();
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();
    private static AtmMachine myAccount = new AtmMachine();


    private static void closeAccount(){

        System.out.print("Are you sure you want to close your account ?");
        String userInput = input.next();

        System.out.println();
        System.out.println();

        if(userInput.equalsIgnoreCase("yes")) {
            System.out.println("Thank You\nWe hope to see you again");
            System.out.println();
            System.out.println();
        }
        else{
            closeAccount();
        }
        createAccountPage();

        if(userInput.equalsIgnoreCase("no")){
            mainMenu();
        }

    }


    private static void changePin(){

        int changeUserPin = newUserAccount.getUserPin();

        pinVerification();

        System.out.println("Choose a PIN");
        int choosePin = input.nextInt();

        System.out.println();
        System.out.println();

        System.out.println("Confirm PIN");
        int confirmPin = input.nextInt();

        System.out.println();
        System.out.println();



        if(choosePin != confirmPin){
            System.out.println("PIN does not match\n\nPlease try again");
            changePin();
        }
        else{
            System.out.println("Done");
            newUserAccount.setPin(confirmPin);
            mainMenu();
        }

    }


    private static void transferBalance(){

        System.out.println("How much would you like to transfer ?");
        double transferAmount = input.nextInt();

        if(transferAmount >  newUserAccount.getUserBalance()){
            System.out.println("Insufficient Funds\n");
            mainMenu();

        }

        newUserAccount.setTransfer(transferAmount);

        System.out.println("Please enter the name of the user");
        String transferName = input.next();

        System.out.println("Please enter the account number of the user");
        String transferAccountNumber = input.next();
        transferAccountNumber = input.next();
        myAccount.setUpdatedAmount(transferAmount);

        myAccount.setThirdUserBalance(transferAmount);
        myAccount.setnewUserAccountNumber(transferAccountNumber);

        System.out.printf("Your account has been Debited, Your remaining balance is: %n%.2f%n", newUserAccount.getUserBalance());

        System.out.println("Would you like make another transfer<yes> or <no>\n\nOr click 'I' to transfer to another bank ?");
        String performAnotherTrans = input.next();

        if(performAnotherTrans.equalsIgnoreCase("yes")){
            transferBalance();
        }

        if(performAnotherTrans.equalsIgnoreCase("no")){
            mainMenu();
        }
        if(performAnotherTrans.equalsIgnoreCase("I")){
            transferBalance();
            myAccount.setThirdUser(transferName);
            myAccount.setThirdUserBalance(transferAmount);
        }

    }


    private static void balance(){


        int userBalance = 0;


        System.out.printf("Name: %s%n",newUserAccount.getUserName());


        System.out.printf("Account Number: %d%n",newUserAccount.getUserAccountNumber());

        System.out.println();
        System.out.println();

        System.out.printf("Account Balance: %n%.2f%n",newUserAccount.getUserBalance());

        System.out.println();
        System.out.println();

        System.out.print("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        mainMenu();
    }


    //Pin verification


    private static void pinVerification(){
        System.out.println("Please enter your pin");
        int pinNo = input.nextInt();

        int pinNumber = newUserAccount.getUserPin();

        if(pinNo != pinNumber){
            System.out.println();
            System.out.println("Wrong pin");
            System.out.println();
            pinVerification();
        }

    }



    private static void withdrawBalance(){

        pinVerification();

        System.out.printf("Your Balance is: %n%.2f%n", newUserAccount.getUserBalance());

        System.out.println("How much would you like to withdraw ?");
        double withdrawAmount = input.nextDouble();


        double totalBalance = newUserAccount.getUserBalance();

        if(withdrawAmount > totalBalance){
            System.out.print("Insufficient Funds !");
            mainMenu();

        }

        if(withdrawAmount < totalBalance){
            System.out.println("Transaction Successful\n");
            newUserAccount.setWithdraw(withdrawAmount);
            mainMenu();

        }

        if(withdrawAmount < 0){
            System.out.println("Wrong Input\n");
            mainMenu();

        }


        System.out.println();
        System.out.println();

        System.out.println("Would you like continue ?");
        String performAnotherTrans = input.next();

        if(performAnotherTrans.equalsIgnoreCase("yes")){
            withdrawBalance();
        }

        if(performAnotherTrans.equalsIgnoreCase("no")){
            mainMenu();
        }
    }

    private static void deposit(){

        int depositMoney = 0;

        System.out.println("Enter amount to deposit");
        double depositMoneyInput = input.nextDouble();

        newUserAccount.setUserBalance(depositMoneyInput);
        System.out.printf("Your initial deposit  is %n%.2f%n",  newUserAccount.getUserBalance());
        mainMenu();
    }


    public static void mainMenu(){

        System.out.println();
        System.out.println();

        System.out.print("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println();
        System.out.println();

        System.out.print("Welcome User " + newUserAccount.getUserAccountNumber());

        System.out.print("""

        Select from these Options:

        1 -> Deposit
        
        2 -> Withdraw Money

        3 -> Account Balance

        4 -> Transfer Money

        5 -> Change pin 

        6 -> Close Account

            """);

        int loginPage = input.nextInt();

        switch(loginPage){
            case 1: deposit();
                break;
            case 2: withdrawBalance();
                break;
            case 3: balance();
                break;
            case 4:  transferBalance();
                break;
            case 5: changePin();
                break;
            case 6: closeAccount();
                break;

        }
    }


    private static void loginPage(){


        System.out.println("Enter your name\n");
        String name = input.nextLine();
        name = input.nextLine();
        System.out.println();
        System.out.println();

        newUserAccount.setName(name);

        System.out.println("\nEnter your pin");
        int pin = input.nextInt();

        int verifyPin = myAccount.getPin();

        newUserAccount.setPin(pin);

        mainMenu();
    }


    private static void confirmUser(){

        long accountNumber = newUserAccount.getUserAccountNumber();
    }


    private static void createPin(){

        System.out.println("Create a pin");
        int pinNumber = input.nextInt();

        newUserAccount.setPin(pinNumber);

    }


    private static void welcomeUserPage(){

        int depositMoneyInput  = 0;
        int endSystem = 0;

        System.out.println("Lets get you started !");

        System.out.println();
        System.out.println();

        System.out.println("Please enter your full name    ");
        String userName = input.nextLine();
        userName = input.nextLine();

        newUserAccount.setName(userName);

        System.out.println();
        System.out.println();


        System.out.printf("WELCOME %s%n", userName);

        long thirdPartyAccountNumber = rand.nextLong(1234567890l);

        System.out.printf("Your new Account Number: %d%nPlease ensure you keep this safe", thirdPartyAccountNumber);

        newUserAccount.setAccountNumber(thirdPartyAccountNumber);

        System.out.println();
        System.out.println();

        createPin();

        System.out.println();
        System.out.println();

        mainMenu();

    }

    private static void createAccountPage(){

        System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");
        System.out.println();
        System.out.println();

        System.out.print("Please ensure you have created an account before logging in");

        System.out.print("""


			1 -> Create Account
			2 -> Login into your account
			
			""");
        int login = input.nextInt();

        if(login != 1){
            createAccountPage();
        }

        switch(login){
            case 1: welcomeUserPage();
                break;
            case 2: loginPage();
                break;

        }


    }

    public static void main(String[] args){
        createAccountPage();
        mainMenu();



    }
}
