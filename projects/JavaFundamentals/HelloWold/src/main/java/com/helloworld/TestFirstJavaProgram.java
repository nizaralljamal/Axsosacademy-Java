package com.helloworld;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFirstJavaProgram {
    private static final Logger logger = Logger.getLogger(TestFirstJavaProgram.class.getName());

    public static void main (String [] args ){
        int a = 25;
        logger.info("My name is Nizar");
        logger.log(Level.INFO, "I''m {0} years old", a); // using String.format
        logger.log(Level.INFO, () -> "I'm " + a + " years old"); // using lambda expression
        logger.log(Level.INFO, "I\'m from in  Jenen , Palstine");
    }
}
