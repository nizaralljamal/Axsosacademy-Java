package com.helloworld;
import java.util.Scanner;
public class PythonIf {
    public static void main(String [] args){

        int n = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = in.nextInt();
        if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20){
                System.out.println("Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
            System.out.println("the number is even");
                }
                
                
        else{
            System.out.println("the number is odd");
            System.out.println("Weird");
        }





    }
}