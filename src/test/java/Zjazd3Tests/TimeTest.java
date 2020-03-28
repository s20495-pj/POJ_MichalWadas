package Zjazd3Tests;

import Zjazd3.Time;
import org.junit.Assert;
import org.junit.Test;

/**
 * summary: Test Time class
 * author: Michal Wadas
 **/
public class TimeTest {

    @Test
    public void testNextSecond() {

        Time time1 = new Time(23, 59, 59);
        Time time2 = new Time(02, 34, 55);

        Assert.assertEquals("00:00:00", time1.nextSecond().toString());
        Assert.assertEquals("02:34:56", time2.nextSecond().toString());
    }

    @Test
    public void testPreviousSecond() {

        Time time1 = new Time(23, 59, 59);
        Time time2 = new Time(00, 00, 00);

        Assert.assertEquals("23:59:58", time1.previousSecond().toString());
        Assert.assertEquals("23:59:59", time2.previousSecond().toString());
    }

    @Test
    public void testToStringWithLeadingZero() {
        Time time1 = new Time(2, 3, 4);
        Assert.assertEquals("02:03:04", time1.toString());
    }
}
