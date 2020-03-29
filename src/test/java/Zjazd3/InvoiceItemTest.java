package Zjazd3Tests;

import Zjazd3.InvoiceItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * summary: Test InvoiceItem class
 * author: Michal Wadas
 **/
public class InvoiceItemTest {

    private InvoiceItem invoiceItem;

    private static final String INVOICE_ITEM_INFORMATION = "InvoiceItem[id=1, desc=pencil, qty=30, unitPrice=1.5]";
    private static final String id  = "1";
    private static final String desc ="pencil";
    private static final int qty = 30;
    private static final double unitPrice = 1.50;

    @Before
    public void setUp() {

        invoiceItem = new InvoiceItem(id, desc, qty, unitPrice);
    }

    @Test
    public void testTotalPrice(){

        double totalPrice = qty * unitPrice;

        Assert.assertEquals(totalPrice, invoiceItem.getTotal(),0);
    }

    @Test
    public void testInvoiceItemInformation(){

        Assert.assertEquals(INVOICE_ITEM_INFORMATION,invoiceItem.toString());
    }
}
