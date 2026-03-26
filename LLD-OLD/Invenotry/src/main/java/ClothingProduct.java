public class ClothingProduct extends Product {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String color;
    private String size;
    public ClothingProduct(String id, String sku, int qty, int price, ProductCategory category){
        super();
        setId(id);
        setPrice(price);
        setQty(qty);
        setSku(sku);
        setProductCategory(category);

    }
}
