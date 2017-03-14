package com.tasks3.fibonacci;

import static org.junit.Assert.*;

/**
 * Created by ahuryn on 14.03.2017.
 */
public class FibonacciTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getNumber() throws Exception {
        Fibonacci fib = new Fibonacci();
        long result;
        result = fib.getNumber(1);
        assertEquals(1, result);
        assertEquals(1, fib.getNumber(2));
        assertEquals(2, fib.getNumber(3));
        assertEquals(3, fib.getNumber(4));
        assertEquals(5, fib.getNumber(5));

        assertEquals(-1, fib.getNumber(-1));
        assertEquals(-1, fib.getNumber(0));
    }

}