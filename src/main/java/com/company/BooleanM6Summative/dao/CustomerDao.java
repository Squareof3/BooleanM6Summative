package com.company.BooleanM6Summative.dao;

import com.company.BooleanM6Summative.model.Customer;

import java.util.List;

public interface CustomerDao {
    Customer getCustomer(int id);

    List<Customer> getAllCustomers();

    Customer addCustomer(Customer customer);

    void updateCustomer();

    void deleteCustomer();

}
