import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class AtmMachineApplication {

    static Scanner input = new Scanner(System.in);
    static Banke myBank = new Banke();
    static Random rand = new Random();


    static ArrayList<Banke> accounts = new ArrayList<>();


    private static void closeAccount(){

        System.out.print("Are you sure you want to close your account ?");
        String userInput = input.next();

        System.out.println();
        System.out.println();

        if(userInput.equalsIgnoreCase("yes")) {
            System.out.println("Thank You\nWe hope to see you again");
            System.out.println();
            System.out.println();
            myBank.removeCustomerAccounts(accounts);
        }
        else{
            closeAccount();
        }
        createAccountPage();
        newUser();


        if(userInput.equalsIgnoreCase("no")){
            mainMenu();
        }

    }


    private static void changePin(){

        int changeUserPin = myBank.getPin();

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
            myBank.setPin(choosePin);
            mainMenu();
        }

    }



    private static void newUser(){

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println();
        System.out.println();

        long thirdPartyAccountNumber = rand.nextLong(1234567890l);

        System.out.println("Your Account Number is: " + thirdPartyAccountNumber);

        System.out.println("Enter your pin");
        int pin = input.nextInt();

        myBank.setName(name);
        myBank.setAccountNumber(thirdPartyAccountNumber);
        myBank.setPin(pin);
        myBank.addAccountName(newUserAccount);

        System.out.println();
        System.out.println();

        System.out.print("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println();
        System.out.println();

        System.out.print("""

				1 -> Deposit

				2 -> Withdraw Money

				3 -> Account Balance

				4 -> Transfer Money

				5 -> Change pin

				6 -> Close Account

					""");

        int loginPage = input.nextInt();

        switch(loginPage){
            case 1: newUserDeposit();
                break;
            case 2: withdrawBalance();
                break;
            case 3: newBalance();
                break;
            case 4:  transferBalance();
                break;
            case 5: changePin();
                break;
            case 6: closeAccount();
                break;
            case 7: System.out.println("Thank you for your Patronage\n");
                break;
            default: mainMenu();
                break;
        }



        double newBalance = myAccount.getBalance();
        String newUserDetails = myAccount.getAccountNumber();
        String oldUserName = myAccount.getthirdUser();

        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();

        mainMenu();

        if(oldUserName == oldUserName && newUserDetails == newUserDetails ){
            System.out.printf("Your account %n%s has been credited by %s Amount: %.2f", newUserDetails, oldUserName, newBalance);
        }

    }


    private static void transferBalance(){

        System.out.println("How much would you like to transfer ?");
        double transferAmount = input.nextInt();

        if(transferAmount >  myAccount.getBalance()){
            System.out.println("Insufficient Funds\n");
            mainMenu();

        }

        System.out.println("Please enter the name of the user");
        String transferName = input.next();

        System.out.println("Please enter the account number of the user");
        String transferAccountNumber = input.next();

        myAccount.setUpdatedAmount(transferAmount);

        myAccount.setThirdUserBalance(transferAmount);
        myAccount.setnewUserAccountNumber(transferAccountNumber);

        System.out.printf("Your account has been Debited, Your remaining balance is: %n%.2f%n", myAccount.getBalance());

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


    private static void withdrawBalance(){

        int userBalance = 0;
        int loadingBalance = 0;

        pinVerification();

        System.out.printf("Your Balance is: %n%.2f%n", myAccount.getBalance());

        System.out.println("How much would you like to withdraw ?");
        double withdrawAmount = input.nextDouble();



        double totalBalance = myAccount.getBalance();

        if(withdrawAmount > totalBalance){
            System.out.print("Insufficient Funds !");
            mainMenu();

        }

        if(withdrawAmount < totalBalance){
            System.out.println("Transaction Successful\n");
            myAccount.setWithdraw(withdrawAmount);
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



    private static void pinVerification(){
        System.out.println("Please enter your pin");
        int pinNo = input.nextInt();

        int pinNumber = myAccount.getPin();

        if(pinNo != pinNumber){
            System.out.println();
            System.out.println("Wrong pin");
            System.out.println();
            pinVerification();
        }

    }




    private static void balance(){


        int userBalance = 0;


        System.out.printf("Name: %s%n",myAccount.getName());


        System.out.print("Account Number: 8366787112");

        System.out.println();
        System.out.println();

        System.out.printf("Account Balance: %n%.2f%n",myAccount.getBalance());

        System.out.println();
        System.out.println();

        System.out.print("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        mainMenu();
    }




    private static void newBalance(){


        System.out.println(myBank);

        System.out.print("Processing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        mainMenu();
    }



    private static void deposit(){

        int depositMoney = 0;

        System.out.println("Enter amount to deposit");
        int depositMoneyInput = input.nextInt();

        myAccount.setDeposit(depositMoneyInput);
        System.out.printf("Your initial deposit  is %n%.2f%n", myAccount.getBalance());
        mainMenu();
    }

    private static void newUserDeposit(){

        double depositMoney = 0;

        System.out.println("Enter amount to deposit");
        double depositMoneyInput = input.nextInt();

        newUserAccount.setUserBalance(depositMoneyInput);
        System.out.printf("Your initial deposit  is %n%.2f%n", newUserAccount.getUserBalance());
        mainMenu();
    }





    public static void mainMenu(){



        System.out.println();
        System.out.println();

        System.out.print("Loading >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println();
        System.out.println();

        System.out.print("""

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
            case 5:  changePin();
                break;
            case 6: closeAccount();
                break;
            case 7: System.out.println("Thank you for your Patronage\n");
                break;
            default: mainMenu();
                break;

        }
    }


    private static void createAccountPage(){

        System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");
        System.out.println();
        System.out.println();


        System.out.print("""

			1 -> Create Account
			2 -> Login into your account
			3 -> Login to another account

			""");
        int login = input.nextInt();

        switch(login){
            case 1: welcomeUserPage();
                break;
            case 2: loginPage();
                break;
            case 3: newUser();
                break;
        }


    }


    private static void loginPage(){
        System.out.println("Enter your name");
        String name = input.next();

        System.out.println();
        System.out.println();

        myAccount.setName(name);

        System.out.println("Enter your pin");
        int pin = input.nextInt();

        int verifyPin = myAccount.getPin();
        myAccount.setPin(pin);
        mainMenu();
    }

    private static void createPin(){

        System.out.println("Create a pin");
        int pinNumber = input.nextInt();

        myAccount.setPin(pinNumber);

    }



    private static void welcomeUserPage(){



        int depositMoneyInput  = 0;
        int endSystem = 0;

        System.out.print("WELCOME TO BANKE MULTINATIONAL BANK");

        System.out.println();
        System.out.println();

        System.out.print("Lets get you started !");

        System.out.println();
        System.out.println();

        System.out.print("Please enter your full name    ");
        String userName = input.next();

        System.out.print("Welcome User: 8366787112");

        System.out.println();
        System.out.println();

        createPin();

        System.out.println();
        System.out.println();

        mainMenu();


        myAccount.setName(userName);


    }




    public static void main(String[] args){

        createAccountPage();
        newUser();
        mainMenu();




    }
}
