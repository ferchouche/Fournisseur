package com.alma.fournisseur.domain.model;

import javax.persistence.*;

/**
 * Created by Abdeldjallil on 13/11/2016.
 */

public class ProductModel {

    protected long id;
    protected String name;
    protected long price;
    protected String description;


    public ProductModel() {
    }

    public ProductModel(long id, String name, long price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
