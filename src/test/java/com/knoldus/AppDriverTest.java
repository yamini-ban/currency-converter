package com.knoldus;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppDriverTest
{
    @BeforeClass
    public static void setUp() {
        CurrencyConverter currencyConverter = new CurrencyConverter();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
