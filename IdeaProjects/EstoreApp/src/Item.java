public class Item {

    private double itemPrice;
    private String item;
    private int quantityOfProductSelected;
    private Product product;


    public Item(String item, double itemPrice){
        this.item = item;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item: " + item  + " " + "Price: " + itemPrice;



    }
}
