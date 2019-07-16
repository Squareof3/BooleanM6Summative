package com.company.BooleanM6Summative.dao;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerDaoTest {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    InvoiceItemDao invoiceItemDao;

    @Before
    public void setUp() throws Exception {
        List<Customer> customerList = customerDao.getAllCustomers();
        for (Customer c : customerList) {
            customerDao.deleteCustomer(c.getId());
        }

        List<Item> itemList = itemDao.getAllItems();
        for (Item i : itemList) {
            itemDao.deleteItem(i.getId());
        }

        List<Invoice> invoiceList = invoiceDao.getAllInvoices();
        for(Invoice i : invoiceList) {
            invoiceDao.deleteInvoice(i.getId());
        }

        List<InvoiceItem> invoiceItemList = invoiceItemDao.getAllInvoiceItems();
        for(InvoiceItem i : invoiceItemList) {
            invoiceItemDao.deleteInvoiceItem(i.getId());
        }
    }

    @Test
    public void addGetDeleteCustomer() {
        Customer customer = new Customer();
        customer.setFirst_name("");
        customer.setLast_name("");
        customer.setEmail("");
        customer.setCompany("");
        customer.setPhone("");

        customer = customerDao.addCustomer(customer);

        Customer customer1 = customerDao.getCustomer(customer.getId());

        assertEquals(customer1, customer);

        customerDao.deleteCustomer(customer.getId());

        customer1 = customerDao.getCustomer(customer.getId());

        assertNull(customer1);
    }

    @Test
    public void getAllCustomers() {

        Customer customer = new Customer();
        customer.setFirst_name("");
        customer.setLast_name("");
        customer.setEmail("");
        customer.setCompany("");
        customer.setPhone("");

        customer = customerDao.addCustomer(customer);

        List<Customer> customerList = customerDao.getAllCustomers();

        assertEquals(customerList.size(), 2);
    }

    @Test
    public void updateCustomer() {

        Customer customer = new Customer();
        customer.setFirst_name("");
        customer.setLast_name("");
        customer.setEmail("");
        customer.setCompany("");
        customer.setPhone("");

        customer = customerDao.updateCustomer(customer);

        Customer customer1 = customerDao.getCustomer(customer.getId());
        assertEquals(customer1, customer);


    }
}
