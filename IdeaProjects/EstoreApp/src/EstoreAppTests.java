import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstoreAppTests {


    @Test
    public void testToCheckIfItemsAreAddedToTheShoppingCart(){
        Item item1 = new Item("Bread", 15000);
        Item item2 = new Item("Butter", 2500);
        ShoppingCart cart = new ShoppingCart();
        cart.addToShoppingCart(item1);
        cart.addToShoppingCart(item2);
        assertEquals(2, cart.getItemList().size());
    }

    @Test
    public void testToCheckThatProductsAreAddedToTheCart(){
        Product product = new Product("Red Wine", "45,000", "1234","Wine & Alcoholics");
        ShoppingCart cart = new ShoppingCart();
        assertEquals(1, cart.getItemList().size());

    }
}
