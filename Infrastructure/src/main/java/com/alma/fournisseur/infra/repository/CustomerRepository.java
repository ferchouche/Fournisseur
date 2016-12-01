package com.alma.fournisseur.infra.repository;

import com.alma.fournisseur.infra.factory.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdeldjallil on 30/11/2016.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>  {
}
