package com.tasks7.add;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ahuryn on 04.04.2017.
 */
public class ApplicationTest {

    @Test
    public void reverse() throws Exception {
        assertEquals("edcba", Application.reverse("abcde"));
    }
    @Test
    public void anagram() throws Exception {
        assertTrue(Application.anagram("кума","мука"));
        assertTrue(Application.anagram("літо","тіло"));
        assertTrue(Application.anagram("school master","the classroom"));
        assertFalse(Application.anagram("school master","the classroon"));
    }
}