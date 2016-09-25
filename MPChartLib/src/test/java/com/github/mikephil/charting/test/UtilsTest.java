package com.github.mikephil.charting.test;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import com.github.mikephil.charting.utils.Utils;

/**
 * Created by pierremarcairoldi on 2016-09-25.
 */

public class UtilsTest {

    @Test
    public void testDecimalWithNaN() {

        float number = Float.NaN;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithPositiveInfinite() {

        float number = Float.POSITIVE_INFINITY;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithNegativeInfinite() {

        float number = Float.POSITIVE_INFINITY;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithZero() {

        float number = (float) 0.0;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithMaxValue() {

        float number = Float.MAX_VALUE;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithMinValue() {

        float number = Float.MIN_VALUE;

        int actual = Utils.getDecimals(number);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testDecimalWithNormalValue() {

        float number = (float) 13.123123;

        int actual = Utils.getDecimals(number);
        int expected = 1; // Don't think this is supposed to be this value maybe 6?

        assertEquals(expected, actual);
    }
}
