package com.tws.refactoring.extract_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tws.refactoring.extract_variable.PriceCalculator;

public class PriceCaculatorTest {
	 @Test
	  public void printOwing() {
		 PriceCalculator priceCaculator = new PriceCalculator();
		 double res = priceCaculator.getPrice(60, 10);
		 assertEquals(660, res,0.01);
		 
	 }
}
