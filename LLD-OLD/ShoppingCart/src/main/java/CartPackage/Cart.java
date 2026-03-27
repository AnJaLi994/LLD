package CartPackage;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    Integer id;
    List<Product> productList = new ArrayList<>();
    int TotalPrice;
    int discount;
    int FinalPrice;
    User user;

    public Cart(Integer id, User user) {
        this.id = id;
        this.user=user;
    }



    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getFinalPrice() {
        return FinalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        FinalPrice = finalPrice;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product p , int qty){
        p.increaseqty(qty);
        computeTotal();
        this.productList.add(p);
    }


    public int computeTotal(){
        int total = 0;
        for (Product item : productList) {
            total += item.getPrice() * item.getQty();
        }
        setTotalPrice(total);
        setFinalPrice(total);
        return total;
    }



}
