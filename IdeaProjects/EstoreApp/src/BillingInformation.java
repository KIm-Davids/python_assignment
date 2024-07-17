import java.util.ArrayList;

public class BillingInformation {

    private ArrayList<BillingInformation> billingInformation = new ArrayList<>();

    public BillingInformation(BillingInformation recieversPhoneNumber, BillingInformation creditCardInformation, BillingInformation delieveryAddress, BillingInformation recieverName) {
        this.billingInformation.add(recieversPhoneNumber);
        this.billingInformation.add(creditCardInformation);
        this.billingInformation.add(delieveryAddress);
        this.billingInformation.add(recieverName);
    }

    public ArrayList<BillingInformation> customerBillingInfo(){
        return billingInformation;
    }

}
