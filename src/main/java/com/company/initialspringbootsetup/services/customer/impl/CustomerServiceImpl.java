package com.company.initialspringbootsetup.services.customer.impl;

import com.company.initialspringbootsetup.dao.customer.CustomerRepository;
import com.company.initialspringbootsetup.model.customer.Customer;
import com.company.initialspringbootsetup.services.BaseServiceImpl;
import com.company.initialspringbootsetup.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */

@Component(value = "customerService")
public class CustomerServiceImpl extends BaseServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findCustomerByEmail(String email)
    {
        return customerRepository.findCustomerByEmail(email);
    }

    @Override
    public Customer findCustomerById(String id)
    {
        return customerRepository.findCustomerById(id);
    }

    @Override
    @Transactional
    public Customer saveCustomer(Customer user)
    {
        try
        {
            Customer mergedUser = this.customerRepository.save(user);
            return mergedUser;
        }
        catch (DataIntegrityViolationException e)
        {
            throw new RuntimeException("Error while saving customer");
        }
    }
}
