package com.example.assignmnt1;

import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class CounterModelTest {

    public CounterModelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTextInput method, of class CounterModel.
     */
    @Test
    public void testGetTextInput() {
        System.out.println("getTextInput");
        CounterModel instance = new CounterModel();
        String expResult = "";
        String result = instance.getTextInput();
        Assert.assertFalse(expResult.equals(result));
        instance.setTextInput("Hello");
        result = instance.getTextInput();
    }
       // assertEquals("Hello", result);


    /**
     * Test of setTextInput method, of class CounterModel.
     */
    @Test
    public void testSetTextInput() {
        System.out.println("setTextInput");
        String textInput = "";
        CounterModel instance = new CounterModel();
        instance.setTextInput(textInput);
        String result = instance.getTextInput();
        Assert.assertEquals("", result);
    }

    /**
     * Test of getLineCount method, of class CounterModel.
     */
    @Test
    public void testGetLineCount() {
        System.out.println("getLineCount");
        CounterModel instance = new CounterModel();
        int expResult = 0;
        int result = instance.getLineCount();
        assertEquals(expResult, result);


    }

    /**
     * Test of getWordCount method, of class CounterModel.
     */
    @Test
    public void testGetWordCount() {
        System.out.println("getWordCount");
        CounterModel instance = new CounterModel();

        // Set up some text input in the CounterModel instance
        String textInput = "Hello world! This is a test.";
        instance.setTextInput(textInput);
        instance.processInput();
        // Expected word count based on the provided text
        int expResult = 11; // "Hello", "world!", "This", "is", "a", "test."

        // Call the getWordCount method and verify the result
        int result = instance.getWordCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharCount method, of class CounterModel.
     */
    @Test
    public void testGetCharCount() {
        System.out.println("getCharCount");
        CounterModel instance = new CounterModel();
        int expResult = 0;
        int result = instance.getCharCount();
        assertEquals(expResult, result);
        String textInput = "Hello world! This is a test.";
        instance.setTextInput(textInput);
        instance.processInput();
        // Expected word count based on the provided text
        expResult = 28; // "Hello", "world!", "This", "is", "a", "test."

        // Call the getWordCount method and verify the result
        result = instance.getCharCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDigitCount method, of class CounterModel.
     */
    @Test
    public void testGetDigitCount() {
        System.out.println("getDigitCount");
        CounterModel instance = new CounterModel();
        int expResult = 0;
        int result = instance.getDigitCount();
        assertEquals(expResult, result);
        String textInput = "Hello world! This is a test. 123";
        instance.setTextInput(textInput);
        instance.processInput();
        // Expected word count based on the provided text
        expResult = 3; // "Hello", "world!", "This", "is", "a", "test."

        // Call the getWordCount method and verify the result
        result = instance.getDigitCount();
        assertEquals(expResult, result);
    }


}
