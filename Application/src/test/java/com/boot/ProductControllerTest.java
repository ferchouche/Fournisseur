package com.boot;



import com.alma.fournisseur.infra.factory.Product;
import com.alma.fournisseur.infra.repository.ProductRepository;
import com.boot.controller.ProductController;


import com.alma.fournisseur.domain.model.ProductModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sidali on 13/11/2016.
 */
public class ProductControllerTest {
    @InjectMocks
    private ProductController pc;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProductkGet(){
        Product prod = new Product();
        prod.setId(1l);
        when(productRepository.findOne(1l)).thenReturn(prod);

        ProductModel product = pc.get(1l);

        verify(productRepository).findOne(1l);

        //assertEquals(1,wreck.getId().longValue());

        assertThat(prod.getId(), is(1l));
    }
}
