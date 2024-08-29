package org.example;
import java.util.*;

public class ProductRepo {
    private Map<String, Product> prodInventory = new HashMap<>();

    public void addProduct(Product product){
        prodInventory.put(product.id(), product);
    }

    public void removeProduct(String id){
        prodInventory.remove(id);
    }

    public Product getSingleProduct(String id){
        return prodInventory.get(id);
    }

    public Map<String, Product> getAllProducts(){
        return prodInventory;
    }


}
