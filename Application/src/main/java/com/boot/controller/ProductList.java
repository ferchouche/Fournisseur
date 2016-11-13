package com.boot.controller;

/**
 * Created by Abdeldjallil on 13/11/2016.
 */
import com.founisseur.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList {
    private static Map<Long, Product> ProductMap = new HashMap<Long, Product>();
    private static Long idIndex = 3L;

    //populate initial wrecks
    static {
        Product a = new Product(1L, "Product1", "Description du premier produit");
        ProductMap.put(1L, a);
        Product b = new Product(2L, "Product1", "Description du deuxieme produit");
        ProductMap.put(2L, b);
        Product c = new Product(3L, "Product3", "Description du troisieme produit");
        ProductMap.put(3L, c);
    }

    public static List<Product> list() {
        return new ArrayList<Product>(ProductMap.values());
    }

    public static Product create(Product wreck) {
        idIndex += idIndex;
        wreck.setId(idIndex);
        ProductMap.put(idIndex, wreck);
        return wreck;
    }

    public static Product get(Long id) {
        return ProductMap.get(id);
    }

    public static Product update(Long id, Product wreck) {
        ProductMap.put(id, wreck);
        return wreck;
    }

    public static Product delete(Long id) {
        return ProductMap.remove(id);
    }
}
