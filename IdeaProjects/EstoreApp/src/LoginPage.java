//import java.util.Scanner;
//import java.util.Arrays;
//
//    public class UserInterface {
//        Scanner input = new Scanner(System.in);
//
//
//        public void firstPage() {
//            String prompt = """
//
//                JUMIA ESTORE APP
//
//                1 ~ Login
//                2 ~ Create Account
//
//                """;
//            System.out.print(prompt);
//            int options = input.nextInt();
//            switch (options) {
//                case 1:
//                    loginPage();
//                    break;
//                case 2:
//                    createAccount();
//                    break;
//            }
//        }
//
//        public void loginPage() {
//            System.out.println("**PLEASE FILL IN THE DETAILS**");
//            System.out.println("Enter your first name");
//            String firstName = input.next();
//
//            System.out.println("Enter your last name");
//            String lastName = input.next();
//
//            System.out.println("Enter password");
//            String password = input.next();
//
//            Customers customers = new Customers(firstName, lastName, password);
//
//            customers.addCustomer(customers);
//
//            System.out.println(customers);
//            for (Customers customer : customers.getCustomersList()) {
//                System.out.println("Total customers in the list " + customer);
//            }
//            mainMenu();
//
//        }
//
//
//        public void createAccount() {
//            String prompt = """
//
//                WELCOME TO MAMA RONKE ESTORE APP
//                  LET'S GET YOU REGISTERED
//                Enter your basic information here:
//
//                """;
//
//            System.out.println(prompt);
//
//            System.out.println("Enter your first name");
//            String firstName = input.next();
//
//            System.out.println("Enter your last name");
//            String lastName = input.next();
//
//            System.out.println("Create a new password");
//            String password = input.next();
//
//            Customers customers = new Customers(firstName, lastName, password);
//
//            for (Customers customer : customers.getCustomersList()) {
//                System.out.println(customer);
//            }
//
//            mainMenu();
//        }
//
//        public void mainMenu() {
//
//            String prompt = """
//
//                1 ~ Product category
//                2 ~ Shopping cart
//                3 ~ Credit Card information
//                4 ~ User profile
//
//                """;
//            System.out.println(prompt);
//            int options = input.nextInt();
//
//            switch (options) {
//                case 1:
//                    productCategory();
//                    break;
//                case 2:
//            }
//        }
//
//        public void productCategory() {
//
//            for (ProductCategory productCategories : ProductCategory.values()) {
//                System.out.println("\n" + productCategories);
//            }
//            System.out.println("\nPick from the category\nSelect an option");
//            int product = input.nextInt();
//
//
//            switch (product) {
//                case 1: String prompt = """
//
//                    List of electronics:
//
//                    1 ~ TV set
//                    2 ~ Mobile Phone
//                    3 ~ Digital Camera
//                    4 ~ Speakers
//                    5 ~ Projectors
//                    6 ~ Others.
//
//                    """;
//                    System.out.println(prompt);
//                    int options = input.nextInt();
//
//                    Item tvSet = new Item("Tv set", 120000);
//                    Item mobilePhone = new Item("Mobile Phone", 350000);
//                    Item digitalCamera = new Item("Digital Camera", 850000);
//                    Item speakers = new Item("Speakers", 6000);
//                    Item projector = new Item("Projector", 1120000);
//
//                    ShoppingCart shoppingCart = new ShoppingCart();
//
//
//                    switch(options) {
//                        case 1 -> shoppingCart.addToShoppingCart(tvSet);
//                        case 2 -> shoppingCart.addToShoppingCart(mobilePhone);
//                        case 3 -> shoppingCart.addToShoppingCart(digitalCamera);
//                        case 4 -> shoppingCart.addToShoppingCart(speakers);
//                        case 5 -> shoppingCart.addToShoppingCart(projector);
//                        default -> System.out.println("Please try again");
//
//                    }
//
//                    System.out.println(shoppingCart.getItemList());
//
//                    System.out.println("Press '1' to continue or '0' to go to mainmenu");
//                    int continueOPtion = input.nextInt();
//                    switch (continueOPtion){
//                        case 1 -> productCategory();
//                        case 0 -> mainMenu();
//                    }
//
//
//                    System.out.println("Update Coming Soon\nPlease be patient");
//                    break;
//
//
//                case 2: String prompt2 = """
//
//                    List of Groceries
//
//                    1 ~ Grains & Bread
//                    2 ~ Oil & Fat
//                    3 ~ Dairy & Eggs
//                    4 ~ Tinned & Dried Produce
//                    5 ~ Condiments
//
//                    """;
//                    System.out.println(prompt2);
//                    int secondOptions = input.nextInt();
//
//                    Item grainAndBread = new Item("Grains & Bread", 120000);
//                    Item  OilAndFat = new Item( "Oil & Fat", 350000);
//                    Item dairyAndEggs = new Item("Dairy & Eggs", 850000);
//                    Item tinnedAndDriedProduce = new Item("Tinned & Dried Produce", 6000);
//                    Item condiments = new Item("Condiments", 1120000);
//
//                    switch(secondOptions){
//                        case 1 -> shoppingCart.addToShoppingCart(grainAndBread);
//                        case 2 -> shoppingCart.addToShoppingCart(OilAndFat);
//                        case 3 -> shoppingCart.addToShoppingCart(dairyAndEggs);
//                        case 4 -> shoppingCart.addToShoppingCart(tinnedAndDriedProduce);
//                        case 5 -> shoppingCart.addToShoppingCart(condiments);
//                    }
//                    System.out.println("Please try again");
//                    productCategory();
//
//
//                    //    System.out.println("Update Coming Soon\n Please be patient");
//
//
//                case 3: String thirdPrompt = """
//
//                    List of Utensils
//
//                    1 ~ Bowls
//                    2 ~ Spider Strainer
//                    3 ~ Kitchen Shears
//                    4 ~ Pastry Brush
//                    5 ~ Tongs
//
//                    """;
//                    System.out.println(thirdPrompt);
//                    int thirdOptions = input.nextInt();
//
//                    System.out.println("Update Coming Soon\n Please be patient");
//
//
//                case 4: String fourthPrompt = """
//
//                    List of Clothing
//
//                    1 ~ Business attire
//                    2 ~ Casual wear
//                    3 ~ Formal wear
//                    4 ~ Lingerie
//                    5 ~ Sports wear
//
//                    """;
//                    System.out.println(fourthPrompt);
//                    int fourthOptions = input.nextInt();
//
//                    System.out.println("Update Coming Soon\n Please be patient");
//
//
//                default: System.out.println("Please try again");
//                    productCategory();
//
//                    // ShoppingCart shoppingCart = new ShoppingCart();
//            }
//        }
//
//
//
//
//
//
//
//
//        public void shoppingCart(){
//            String prompt = """
//
//                        1 ~ Enter payment method
//                        2 ~ Enter product detail
//                        3 ~ Check out
//
//                        """;
//
//            System.out.println(prompt);
//            int options = input.nextInt();
//            switch (options){
//                case 1:
//            }
//        }
//
//    }
//
//
//
//
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
