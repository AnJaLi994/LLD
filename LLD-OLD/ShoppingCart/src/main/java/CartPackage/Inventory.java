package CartPackage;

import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> productHashMap;

    Inventory(){
        productHashMap = new HashMap<>();
    }

    public void addToInventory(Integer id, int qty){
        if(productHashMap.containsKey(id)){
            Product p = productHashMap.get(id);
            p.increaseqty(qty);
            productHashMap.put(id, p);
        }


    }


    public void removeFromInventory(Integer id, int qty){
        if(productHashMap.containsKey(id)){
            Product p = productHashMap.get(id);
            p.increaseqty(qty);
            productHashMap.put(id, p);
        }


    }
}
