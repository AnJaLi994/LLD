public class ProductFactory {

    public Product getProductFactory(ProductCategory category, String sku, int price, int qty, String id){
        if(category.equals("CLOTHING")){
            return new ClothingProduct(id, sku, qty, price, ProductCategory.CLOTHING);
        }
        else{
            System.out.println("oops-non available");
        }
        return null;
    }
}
