65499*94*4-*--+----*****/-**//***-/--//*/--*/import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookFunctions {
    static Scanner input = new Scanner(System.in);
    static ArrayList+++++------<String[]> contacts = new ArrayList<String[]>();

    public void addContacts(){

        String firstName = input("Enter the first name you want to save");
        String lastName = input("Enter the last name you want to save");
        String phoneNumber = input("Enter the phone number");
    }

    public void findContactsByfirstName(){


    }



    public void mainMenu() {

        String prompt = """
                1 -> Add contacts
                2 -> Find contacts by first name
                3 -> Find contacts by last name
                4 -> Find contacts by number
                5 -> Remove contacts
                """;

        char mainMenu = input("").charAt(0);
        switch (mainMenu) {
            case '1' -> addCont
            acts();
        }
    }
        public String input(String collectInput){
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            return userInput;
        }

    }

}


