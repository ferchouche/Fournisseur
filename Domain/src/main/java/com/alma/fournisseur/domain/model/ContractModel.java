package com.alma.fournisseur.domain.model;



import javax.persistence.*;




/**
 * Created by Abdeldjallil on 29/11/2016.
 */
public class ContractModel {


    protected long id;
    protected long idcustomer;
    protected long total_price;

    public ContractModel() {
    }

    public ContractModel(int id, long idcustomer, Long total_price) {
        this.id = id;
        this.idcustomer = idcustomer;
        this.total_price = total_price;
    }


}
