package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String test = "test";
        String check = String.valueOf(task3.removeDuplicates(test));

        assertNotNull(check);
        assertEquals("test should outcome as \"[s, t, e]\"",
                "[s, t, e]", check);
    }

    @Test
    public void test_removeDuplicates_average(){
        String test = "dddoogggg";
        String check = String.valueOf(task3.removeDuplicates(test));

        assertNotNull(check);
        assertEquals("test should outcome as \"[d, g, o]\"",
                "[d, g, o]", check);
    }

    @Test
    public void test_removeDuplicates_worst(){
        String test = null;
        String check = String.valueOf(task3.removeDuplicates(test));

        assertNotNull(check);
        assertEquals("test should outcome as Empty String",
                "[]", check);
    }

    @Test
    public void test_areTheseAnagrams_best(){
        String test1 = "test";
        String test2 = "tset";
        String check = String.valueOf(task3.areTheseAnagrams(test1,test2));

        assertNotNull(check);
        assertEquals("test should outcome as \"true\"",
                "true", check);
    }

    @Test
    public void test_areTheseAnagrams_average(){
        String test1 = "test";
        String test2 = "apple";
        String check = String.valueOf(task3.areTheseAnagrams(test1,test2));

        assertNotNull(check);
        assertEquals("test should outcome as \"false\"",
                "false", check);
    }

    @Test
    public void test_areTheseAnagrams_worst(){
        String test1 = null;
        String test2 = null;
        String check = String.valueOf(task3.areTheseAnagrams(test1, test2));

        assertNotNull(check);
        assertEquals("test should outcome as \"false\"",
                "false", check);
    }

}
