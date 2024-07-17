import java.util.ArrayList;

public class Product {

    private ProductCategory productCategory;
    ArrayList<String> descriptions = new ArrayList<>();

    public Product(String name, String price,String productId , String productCategory) {
        this.descriptions.add(name);
        this.descriptions.add(price);
        this.descriptions.add(productId);
        this.descriptions.add(productCategory);

    }

    public ArrayList<String> products(){
        return descriptions;
    }



}
