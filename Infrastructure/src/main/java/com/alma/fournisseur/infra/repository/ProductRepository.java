package com.alma.fournisseur.infra.repository;

import com.alma.fournisseur.infra.factory.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdeldjallil on 16/11/2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
