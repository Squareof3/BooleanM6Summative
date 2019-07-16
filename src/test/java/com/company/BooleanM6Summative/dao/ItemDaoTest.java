package com.company.BooleanM6Summative.dao;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItemDaoTest {

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
    public void addGetDeleteItem() {
        Item item = new Item();
        item.setName("");
        item.setDescription("");
        item.setDaily_rate("");

        item = itemDao.addItem(item);

        Item item1 = itemDao.getItem(item.getId());

        assertEquals(item1, item);

        itemDao.deleteItem(item.getId());

        item1 = itemDao.getItem(item.getId());

        assertNull(item1);
    }

    @Test
    public void getAllItems() {

        Item item = new Item();
        item.setName("");
        item.setDescription("");
        item.setDaily_rate("");

        item = itemDao.addItem(item);

        List<Item> itemList = itemDao.getAllItems();

        assertEquals(itemList.size(), 1);
    }

    @Test
    public void updateItem() {

        Item item = new Item();
        item.setName("");
        item.setDescription("");
        item.setDaily_rate("");

        item = itemDao.addItem(item);

        itemDao.updateItem(item);

        Item item1 = itemDao.getItem(item.getId());
        assertEquals(item1, item);
    }

    
}
