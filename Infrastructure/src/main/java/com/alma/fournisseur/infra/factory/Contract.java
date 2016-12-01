package com.alma.fournisseur.infra.factory;

import com.alma.fournisseur.domain.model.ContractModel;

import javax.persistence.*;


/**
 * Created by Abdeldjallil on 29/11/2016.
 */
@Entity
@Table(name="CONTRACT")
public class Contract extends ContractModel {

    public Contract() {
    }

    public Contract(int factNumber, long idcustomer, long total_price) {
        super(factNumber, idcustomer, total_price);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Long idcustomer) {
        this.idcustomer = idcustomer;
    }

    public long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

}
