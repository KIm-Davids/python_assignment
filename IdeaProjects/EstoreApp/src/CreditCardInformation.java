import java.util.ArrayList;

public class CreditCardInformation extends Users {

   private ArrayList<CreditCardInformation> creditCardInfo = new ArrayList<>();


    public CreditCardInformation(CreditCardInformation nameOnCard, CreditCardInformation creditCardNumber, CreditCardInformation yearAndMonth, CreditCardInformation cvv, CreditCardInformation cardType) {
        this.creditCardInfo.add(nameOnCard);
        this.creditCardInfo.add(creditCardNumber);
        this.creditCardInfo.add(yearAndMonth);
        this.creditCardInfo.add(cvv);
        this.creditCardInfo.add(cardType);
    }



}
