import java.util.Arrays;

public enum ProductCategory {

    ELECTRONICS,
    GROCERIES,
    UTENSILS,
    CLOTHING;

    private Product[] shelf;

    ProductCategory(Product... product){
        this.shelf = product;
    }

    public Product[] getProduct(){
        return shelf;
    }

    public String toString(){
        return Arrays.toString(shelf);
    }

}
