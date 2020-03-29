package Zjazd3Tests;

import Zjazd3.Date;
import org.junit.Assert;
import org.junit.Test;

/**
 * summary: Test Date class
 * author: Michal Wadas
 **/
public class DateTest {

    @Test
    public void testToStringWithLeadingZero() {
        Date date = new Date(2, 3, 1995);
        Assert.assertEquals("02/03/1995", date.toString());
    }
}
