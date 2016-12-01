package com.alma.fournisseur.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

/**
 * Created by Abdeldjallil on 29/11/2016.
 */
public class CustomerModel {


    protected long id;
    protected String name;
    protected String adress;

    public CustomerModel() {

    }

    public CustomerModel(long id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }


}
