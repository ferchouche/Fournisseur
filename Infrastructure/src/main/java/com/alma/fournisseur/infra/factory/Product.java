package com.alma.fournisseur.infra.factory;

import com.alma.fournisseur.domain.model.ProductModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Abdeldjallil on 13/11/2016.
 */
@Entity
@Table(name="PRODUCT")
public class Product extends ProductModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Product() { super(); }

    public Product(long id, String name, long price, String description) {
        super(id, name, price, description);
    }
}
