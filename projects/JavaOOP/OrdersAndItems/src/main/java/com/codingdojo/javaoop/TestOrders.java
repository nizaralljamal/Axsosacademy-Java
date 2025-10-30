package com.codingdojo.javaoop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestOrders {
    private static final Logger logger = Logger.getLogger(TestOrders.class.getName());
    private static final String NAME_FORMAT = "Name: {0}";
    private static final String TOTAL_FORMAT = "Total: {0}";
    private static final String READY_FORMAT = "Ready: {0}";

    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item4 = new Item("cappuccino", 4.5);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Rami");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
    
        // Application Simulations
        // Use this example code to test various orders' updates
        logger.log(Level.INFO, NAME_FORMAT, order1.getName());
        logger.log(Level.INFO, TOTAL_FORMAT, order1.getTotal());
        logger.log(Level.INFO, READY_FORMAT, order1.getReady());

        // Add item1 to order2's item list and increment the order's total.
        order2.getItems().add(item1);
        order2.setTotal(order2.getTotal() + item1.getPrice());

        // Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.getItems().add(item4);
        order3.setTotal(order3.getTotal() + item4.getPrice());

        // Sam added a latte. Update the order accordingly.
        order4.getItems().add(item2);
        order4.setTotal(order4.getTotal() + item2.getPrice());

        // Rami’s order is now ready. Update her status.
        order1.setReady(true);

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.getItems().add(item2);
        order4.setTotal(order4.getTotal() + item2.getPrice());
        order4.getItems().add(item2);
        order4.setTotal(order4.getTotal() + item2.getPrice());

        // Jimmy’s order is now ready. Update his status.
        order2.setReady(true);

        // Print the updated order details
        logger.log(Level.INFO, NAME_FORMAT, order1.getName());
        logger.log(Level.INFO, TOTAL_FORMAT, order1.getTotal());
        logger.log(Level.INFO, READY_FORMAT, order1.getReady());

        logger.log(Level.INFO, NAME_FORMAT, order2.getName());
        logger.log(Level.INFO, TOTAL_FORMAT, order2.getTotal());
        logger.log(Level.INFO, READY_FORMAT, order2.getReady());

        logger.log(Level.INFO, NAME_FORMAT, order3.getName());
        logger.log(Level.INFO, TOTAL_FORMAT, order3.getTotal());
        logger.log(Level.INFO, READY_FORMAT, order3.getReady());

        logger.log(Level.INFO, NAME_FORMAT, order4.getName());
        logger.log(Level.INFO, TOTAL_FORMAT, order4.getTotal());
        logger.log(Level.INFO, READY_FORMAT, order4.getReady());
    }
}