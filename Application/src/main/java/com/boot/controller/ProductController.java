package com.boot.controller;

/**
 * Created by Abdeldjallil on 13/11/2016.
 */
import java.util.List;

import com.founisseur.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ProductController {

    @RequestMapping(value = "products", method = RequestMethod.GET)
    public List<Product> list() {
        return ProductList.list();
    }

    @RequestMapping(value = "products", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return ProductList.create(product);
    }

    @RequestMapping(value = "products/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable Long id) {
        return ProductList.get(id);
    }

    @RequestMapping(value = "products/{id}", method = RequestMethod.PUT)
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return ProductList.update(id, product);
    }

    @RequestMapping(value = "products/{id}", method = RequestMethod.DELETE)
    public Product delete(@PathVariable Long id) {
        return ProductList.delete(id);
    }
}
