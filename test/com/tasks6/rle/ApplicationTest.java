package com.tasks6.rle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ApplicationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void main1() throws Exception {
        String[] testString = {"Hhhhhhhhhhhhhheeeellooooo"};
        Application.main(testString);
        assertEquals("Hh9h4e4l2o5"+"\r\n", outContent.toString());
    }
    @Test
    public void main2() throws Exception {
        String[] testString = {""};
        Application.main(testString);
        assertEquals(""+"\r\n", outContent.toString());
    }
    @Test
    public void main3() throws Exception {
        String[] testString = {"hh44+ttti"};
        Application.main(testString);
        assertEquals("h244+t3i"+"\r\n", outContent.toString());
    }

}