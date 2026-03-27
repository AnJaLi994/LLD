package CartPackage;

public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    String name;
    Integer id;
    Integer qty;
    Integer price;

    Product(String n, Integer idof, Integer q, Integer p){
        name=n;
        id=idof;
        qty=q;
        price=p;
    }


    public void increaseqty(int qy){
        qty = qty+ qy;
    }


    public void decreaseqty(int qy){
        qty = qty+ qy;
    }
}
