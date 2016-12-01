package com.boot;

import com.alma.fournisseur.infra.factory.Product;
import com.alma.fournisseur.infra.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

/**
 * Created by sidali on 13/11/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ProductRepositoryIntegrationTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindAll(){
        List<Product> products = productRepository.findAll();
        assertThat(products.size(), is(greaterThanOrEqualTo(0)));
    }
}
