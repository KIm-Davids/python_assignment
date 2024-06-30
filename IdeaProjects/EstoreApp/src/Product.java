import java.util.ArrayList;

public class Product {

    private ProductCategory productCategory;
    ArrayList<Product> products = new ArrayList<>();

    public Product(Product productId, Product productDescription, Product price, Product name, ProductCategory productCategory) {
        this.products.add(productId);
        this.products.add(productDescription);
        this.products.add(price);
        this.products.add(name);
        this.productCategory = productCategory;
    }



}
