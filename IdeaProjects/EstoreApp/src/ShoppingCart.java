import java.util.ArrayList;

public class ShoppingCart {


    private String paymentMethod;
    private ArrayList<Item> itemList = new ArrayList<>();

    public Item addToShoppingCart(Item item){
        this.itemList.add(item);
        return item;
    }

    public ArrayList<Item> getItemList() {
        return itemList;

    }

    public void PaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }

   public String toString() {
        return String.valueOf(itemList);
    }
}
