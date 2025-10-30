package com.helloworld;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        char letter;
        int c = 0;
        
        do{
            System.out.println("enter your char : ");
            letter = in.next().charAt(0);
            if (letter != 'q')
            c++;
        }while(letter != 'q');
        
        System.out.println("count " + c);









    }
    }
