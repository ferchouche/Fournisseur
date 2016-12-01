package com.alma.fournisseur.infra.factory;


import com.alma.fournisseur.domain.model.CustomerModel;

import javax.persistence.*;

/**
 * Created by Abdeldjallil on 29/11/2016.
 */
@Entity
@Table(name="CUSTOMER")
public class Customer extends CustomerModel {

    public Customer() {
        super();
    }

    public Customer(long customernumber, String name, String adress) {
        super(customernumber, name, adress);
    }

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
