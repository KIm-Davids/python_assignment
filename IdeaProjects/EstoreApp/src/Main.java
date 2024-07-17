public class Main {
    public static void main(String[] args) {


   Item item = new Item("Bread", 15000);
   ShoppingCart cart = new ShoppingCart();
   cart.addToShoppingCart(item);
        System.out.println(cart.getItemList());
    }
}