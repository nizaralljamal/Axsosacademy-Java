package com.helloworld;
import java.util.Scanner;

public class PowerMod {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the base number:");
        int base = in.nextInt();
        System.out.println("Please enter the exponent number:");
        int exponent = in.nextInt();
        System.out.println("Please enter the mod number");
        int mod = in.nextInt();
        int result = (int) Math.pow(base, exponent) % mod;
        System.out.println("The result of " + base + " to the power of " + exponent + " modulo " + mod + " is: " + result); 





    }
}
