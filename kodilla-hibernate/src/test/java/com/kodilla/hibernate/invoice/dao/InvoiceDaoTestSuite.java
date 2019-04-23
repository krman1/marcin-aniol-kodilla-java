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
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given

        Item itemOne = new Item(new Product("Product one"), new BigDecimal(15), 3, new BigDecimal(45));
        Item itemTwo = new Item(new Product("Product two"), new BigDecimal(2), 4, new BigDecimal(8));
        Item itemThree = new Item(new Product("Product three"), new BigDecimal(3), 3, new BigDecimal(9));
        Item itemFour = new Item(new Product("Product four"), new BigDecimal(5), 1, new BigDecimal(5));

        Invoice invoice = new Invoice("ZAMP/3/2019");

        itemOne.setInvoice(invoice);
        itemTwo.setInvoice(invoice);
        itemThree.setInvoice(invoice);
        itemFour.setInvoice(invoice);

        invoice.getItems().add(itemOne);
        invoice.getItems().add(itemTwo);
        invoice.getItems().add(itemThree);
        invoice.getItems().add(itemFour);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}

