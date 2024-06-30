import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);


    public void firstPage() {
        String prompt = """
                
                JUMIA ESTORE APP
                                
                1 ~ Login 
                2 ~ Create Account 
                               
                """;
        System.out.print(prompt);
        int options = input.nextInt();
        switch (options) {
            case 1: loginPage();
                    break;
            case 2: createAccount();
                    break;
        }
    }

        public void loginPage() {
            System.out.println("**PLEASE FILL IN THE DETAILS**");
            System.out.println("Enter your first name");
            String firstName = input.next();

            System.out.println("Enter your last name");
            String lastName = input.next();

            System.out.println("Enter password");
            String password = input.next();

            Customers customers = new Customers(firstName, lastName, password);

            customers.addCustomer(customers);

            System.out.println(customers);
            for (Customers customer : customers.getCustomersList()){
                System.out.println("Total customers in the list " + customer);
            }
            mainMenu();

        }

//        public void getCustomerList(){
//        Customers customer = new
//        }


        public void createAccount(){
            String prompt = """
                    
                    WELCOME TO MAMA RONKE ESTORE APP
                      LET'S GET YOU REGISTERED
                    Enter your basic information here:
                    
                    """;

            System.out.println(prompt);

            System.out.println("Enter your first name");
            String firstName = input.next();

            System.out.println("Enter your last name");
            String lastName = input.next();

            System.out.println("Create a new password");
            String password = input.next();

            Customers customers = new Customers(firstName,lastName,password);

            for(Customers customer : customers.getCustomersList()){
                System.out.println(customer);
            }

            mainMenu();
        }

        public void mainMenu(){

             String prompt = """
                
                1 ~ Search
                2 ~ Product category
                3 ~ Shopping cart
                4 ~ Credit Card information
                5 ~ User profile
                               
                """;
            System.out.println(prompt);
            int options = input.nextInt();

            switch (options){
                case 1: searchButton();
                        break;
                case 2:
            }


            //switch
        }



        public void searchButton() {

            System.out.println("Search for a product here");
            String options = input.next();


            for (ProductCategory productCategories : ProductCategory.values()) {
                switch(options) {
                    case "ELECTRONICS": String prompt = """
                                        
                                        1 ~ TV set
                                        2 ~ Mobile Phone
                                        3 ~ Digital Camera 
                                        4 ~ Speakers
                                        5 ~
                            
                            
                                        """;





//                    switch (options){
//                        case 1
//                    }
                    // searchButton();
//
                }
            }
        }

            public void productCategory(){





            }

            public void shoppingCart(){
                String prompt = """

                        1 ~ Enter payment method
                        2 ~ Enter product detail
                        3 ~ Check out

                        """;

                System.out.println(prompt);
                int options = input.nextInt();
                switch (options){
                    case 1:
                }
            }

                }




//












