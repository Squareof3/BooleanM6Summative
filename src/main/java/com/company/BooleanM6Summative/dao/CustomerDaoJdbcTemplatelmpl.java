package com.company.BooleanM6Summative.dao;

import com.company.BooleanM6Summative.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerDaoJdbcTemplatelmpl implements CustomerDao {

    private static final String INSERT_CUSTOMER_SQL =
            "insert into customer (first_name, last_name, email, company, phone)values (?,?,?,?,?)";
    private static final String SELECT_CUSTOMER_SQL =
            "select * from customer where customer_id = ?";
    private static final String SELECT_ALL_CUSTOMERS_SQL =
            "Select * from customer";
    private static final String DELETE_CUSTOMER_SQL =
            "delete from customer where customer_id = ?";
    private static final String UPDATE_CUSTOMER_SQL =
            "update customer set first_name, last_name, email, company, phone where customer_id =?";
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoJdbcTemplatelmpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public void updateCustomer() {

    }

    @Override
    public void deleteCustomer() {

    }

    private Customer mapRowToCustomer(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setCustomerId(rs.getInt("customer_id"));
        customer.setFirstName(rs.getString("first_name"));
        customer.setLastName(rs.getString("last_name"));
        customer.setEmail(rs.getString("email"));
        customer.setCompany(rs.getString("company"));
        customer.setPhone(rs.getString("phone"));
        return customer;
    }
}
