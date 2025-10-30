package com.mycompany.app;

public class CafeJavaa {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double coffee = 3.5;
        double latte = 4.5;
        double cappuccino = 2.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Sali";
        String customer2 = "ahmad";
        String customer3 = "Adam";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
                System.out.println(customer2+" " + displayTotalMessage + latte);
        }
        else
                System.out.println(customer2 + pendingMessage);

        if (isReadyOrder2) {
            System.out.println(customer1 + readyMessage);
                System.out.println(customer1+" " + displayTotalMessage + latte * 2);
        }
        else
                System.out.println(customer1 + pendingMessage);

        if (isReadyOrder2) {
            System.out.println(customer3 + readyMessage);
                System.out.println(customer3+" " + displayTotalMessage + (latte - cappuccino));
        }
        else
                System.out.println(customer3 + pendingMessage);
    }
}

