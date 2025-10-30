package com.mycompany.app;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CafeJava {
    private static final Logger logger = Logger.getLogger(CafeJava.class.getName());

    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, {0}";
        String pendingMessage = "{0}, your order will be ready shortly";
        String readyMessage = "{0}, your order is ready";
        String displayTotalMessage = "Your total is ${0}";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;
        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Order completions (add yours below)
        final boolean isReadyOrder1 = false;
        final boolean isReadyOrder2 = true;
        final boolean isReadyOrder3 = false;
        final boolean isReadyOrder4 = true;
        
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        logger.log(Level.INFO, generalGreeting, customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // Cindhuri's order
        if (isReadyOrder1) {
            logger.log(Level.INFO, readyMessage, customer1);
        }
        else {
            logger.log(Level.INFO, pendingMessage, customer1);
        }

        // Noah's order
        if (isReadyOrder4) {
            logger.log(Level.INFO, readyMessage, customer4);
            logger.log(Level.INFO, displayTotalMessage, cappuccinoPrice);
        }
        else {
            logger.log(Level.INFO, pendingMessage, customer4);
        }

        // Sam's order
        logger.log(Level.INFO, displayTotalMessage, (lattePrice * 2));
        if (isReadyOrder2) {
            logger.log(Level.INFO, readyMessage, customer2);
        }
        else {
            logger.log(Level.INFO, pendingMessage, customer2);
        }

        // Jimmy's order
        logger.log(Level.INFO, "{0}, Your total is ${1}", new Object[]{customer3, (lattePrice - dripCoffeePrice)});
        if (isReadyOrder3) {
            logger.log(Level.INFO, readyMessage, customer3);
        } else {
            logger.log(Level.INFO, pendingMessage, customer3);
        }

        // Using mochaPrice
        logger.log(Level.INFO, "A customer ordered a mocha. The price is: Your total is ${0}", mochaPrice);
    }
}