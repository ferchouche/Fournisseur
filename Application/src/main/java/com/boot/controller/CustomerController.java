package com.boot.controller;

import com.alma.fournisseur.infra.factory.Customer;
import com.alma.fournisseur.infra.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Abdeldjallil on 30/11/2016.
 */
@RestController
@RequestMapping("api/v1/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @RequestMapping(value = "customers", method = RequestMethod.GET)
    public List<Customer> list() {
        return customerRepository.findAll();
    }

    @RequestMapping(value = "customers", method = RequestMethod.POST)
    public Customer create(@RequestBody Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @RequestMapping(value = "customers/{id}", method = RequestMethod.GET)
    public Customer get(@PathVariable long id) {
        return customerRepository.findOne(id);
    }

    @RequestMapping(value = "customers/{id}", method = RequestMethod.PUT)
    public Customer update(@PathVariable long id, @RequestBody Customer customer) {
        Customer existingCustomer = customerRepository.findOne(id);
        BeanUtils.copyProperties(customer, existingCustomer);
        return customerRepository.saveAndFlush(customer);
    }

    @RequestMapping(value = "customers/{id}", method = RequestMethod.DELETE)
    public Customer delete(@PathVariable long id) {
        Customer existingCustomer = customerRepository.findOne(id);
        customerRepository.delete(existingCustomer);
        return existingCustomer;
    }
}
