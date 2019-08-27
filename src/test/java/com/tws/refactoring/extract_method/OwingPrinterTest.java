package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
    	//given
    	OwingPrinter owingPrinter = new OwingPrinter();
    	//when
    	String output = owingPrinter.printDetails("lisa", 0.3);
    	//then
    	System.out.println(output);
    	assertEquals("name:lisa", output);
    }
    
    @Test
    public void testPrintBanner() {
    	//given
    	OwingPrinter owingPrinter = new OwingPrinter();
    	//when
    	String output = owingPrinter.printBanner();
    	//then
    	assertEquals("1", output);
    }
    
    @Test
    public void testSumOwings() {
    	//given
    	OwingPrinter owingPrinter = new OwingPrinter();
    	//when
    	List<Order> list = Arrays.asList(new Order(0.3d),new Order(0.4d));
    	double db = owingPrinter.sumOwings(list);
    	//then
    	assertEquals(0.7, db,0.01);
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void testOrders() {
    	//given
    	Order order = new Order(0.3d);
    	//when
    	double db = order.getAmount();
    	assertEquals(0.3, db,0.01);
    }
    
}