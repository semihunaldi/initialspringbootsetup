package com.company.initialspringbootsetup.dao.customer;

import com.company.initialspringbootsetup.model.customer.Customer;
import com.company.initialspringbootsetup.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>
{
    @Query("select cus from Customer cus where cus.deleted='0'")
    public List<Customer> findAllCustomers();

    @Query("select cus from Customer cus where cus.email=:email and cus.deleted='0'")
    public Customer findCustomerByEmail(@Param("email") String email);

    @Query("select cus from Customer cus where cus.id=:id and cus.deleted='0'")
    public Customer findCustomerById(@Param("id") String id);
}
