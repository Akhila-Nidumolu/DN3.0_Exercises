class Product {
    int pId;
    String pName;
    String cat;

    public Product(int pId, String pName, String cat) {
        this.pId = pId;
        this.pName = pName;
        this.cat = cat;
    }
}
class Search {
    public static Product linearSearch(Product[] products, String pName) {
        for (Product product : products) {
            if (product.pName.equals(pName)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String pName, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].pName.equals(pName)) {
                return products[mid];
            }
            if (products[mid].pName.compareTo(pName) > 0) {
                return binarySearch(products, pName, left, mid - 1);
            } else {
                return binarySearch(products, pName, mid + 1, right);
            }
        }
        return null;
    }
}
