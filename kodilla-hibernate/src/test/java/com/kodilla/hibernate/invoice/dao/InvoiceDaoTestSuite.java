package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product2 = new Product("Prod1");
        Product product1 = new Product("Prod2");
        Product product3 = new Product("Prod3");

        Item item1 = new Item(product1, new BigDecimal(10), 2);
        Item item2 = new Item(product2, new BigDecimal(15), 1);
        Item item3 = new Item(product3, new BigDecimal(20), 2);

        Invoice invoice = new Invoice("0001");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoiceDao.save(invoice);


        //Then
        Assert.assertNotEquals(0, invoice.getId());
        Assert.assertEquals(new BigDecimal(20), invoice.getItems().get(2).getPrice());
        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
