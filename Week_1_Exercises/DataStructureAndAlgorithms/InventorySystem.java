import java.util.HashMap;
import java.util.Map;
class Product {
    int pId;
    String pName;
    int quan;
    double price;

    public Product(int pId, String pName, int quan, double price) {
        this.pId = pId;
        this.pName = pName;
        this.quan = quan;
        this.price = price;
    }
}
class Inventory {
    private Map<Integer, Product> products;
    public Inventory() {
        this.products = new HashMap<>();
    }
    public void addProduct(Product product) {
        products.put(product.pId, product);
    }
    public void updateProduct(Product product) {
        products.put(product.pId, product);
    }
    public void deleteProduct(int pId) {
        products.remove(pId);
    }
    public Product getProduct(int pId) {
        return products.get(pId);
    }
}
