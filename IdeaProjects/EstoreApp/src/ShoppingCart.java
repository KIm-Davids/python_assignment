public class ShoppingCart {

    private Item item;
    private int itemPrice;
    private String paymentMethod;



    public ShoppingCart(Item item, int itemPrice, String paymentMethod){
        this.item = item;
        this.itemPrice = itemPrice;
        this.paymentMethod = paymentMethod;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public Item getItem(){
        return item;
    }
}
