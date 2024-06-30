import java.util.ArrayList;

public class Customers extends Users{

       private String firstName;
       private String lastName;
       private BillingInformation billingInformation;
       private ShoppingCart shoppingCart;
       private String userName;
       private String password;
       private ArrayList<Customers> customerList = new ArrayList<>();

       public Customers(String firstName, String lastName, String password){
              this.firstName = firstName;
              this.lastName = lastName;
              this.password = password;
       }

       public void oldCustomers(String userName, String password){
              this.userName = userName;
              this.password = password;
       }

       public void addCustomer(Customers customer) {
              this.customerList.add(customer);
       }

       public ArrayList<Customers> getCustomersList() {
              return customerList;
       }
       public String toString(){
              return "The customers in the list includes: " + firstName + " " + lastName + " and password " + password;
       }



}
