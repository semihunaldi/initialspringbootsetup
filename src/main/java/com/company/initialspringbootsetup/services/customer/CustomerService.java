package com.company.initialspringbootsetup.services.customer;

import com.company.initialspringbootsetup.model.customer.Customer;
import com.company.initialspringbootsetup.services.BaseService;

/**
 *
 */
public interface CustomerService extends BaseService
{
    Customer findCustomerByEmail(String email);

    Customer findCustomerById(String id);

    Customer saveCustomer(Customer user);
}
