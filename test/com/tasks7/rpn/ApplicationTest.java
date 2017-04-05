package com.tasks7.rpn;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {
    @Test
    public void parse() throws Exception {
        assertEquals(2100,Application.parse("10 20 + 30 40 + *"),0.001);
        assertEquals(610,Application.parse("10 20 30.0 * +"), 0.001);
    }

    @Test(expected=RPNParserException.class)
    public void testRPNParserException1() {
        Application.parse("10 20 30 () +");
    }
    @Test(expected=RPNParserException.class)
    public void testRPNParserException2() {
        Application.parse("10 20 Е * +");
    }
    @Test(expected=RPNParserException.class)
    public void testRPNParserException3() {
        Application.parse("10 20 30.0 * + -");
    }
    @Test(expected=RPNParserException.class)
    public void testRPNParserException4() {
        Application.parse("   * + -");
    }
    @Test(expected=ArithmeticException.class)
    public void testArithmeticException() {
        Application.parse("0 0 /");
    }
}