package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
	
    void printOwing(String name,List<Order> orders) {
        // print banner
        printBanner();
        
        double outstanding = sumOwings(orders);
        // print details
        printDetails(name, outstanding);
    }

	public String printDetails(String name, double outstanding) {
		System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
        return("name:"+name);
	}

	public String printBanner() {
		System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
        return "1";
	}
    
    public double sumOwings(List<Order> orders) {
    	Iterator<Order> elements = orders.iterator();
    	double outstanding = 0.0; 
    	while (elements.hasNext()) {
          Order each = (Order) elements.next();
          outstanding += each.getAmount();
      }
    	return outstanding;
    }
}



class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}