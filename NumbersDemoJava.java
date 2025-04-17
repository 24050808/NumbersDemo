/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersdemo.java;

/**
 *
 * @author Phumlani Lubisi
 */

public class NumbersDemoJava {   
    public static void main(String[] args) {
     
        int num1 = 4;
        int num2 = 7;
     
        displayTwiceTheNumber(num1);      
        displayNumberPlusFive(num1);      
        displayNumberSquared(num1);       

        displayTwiceTheNumber(num2);      
        displayNumberPlusFive(num2);    
        displayNumberSquared(num2);       
    }   
    public static void displayTwiceTheNumber(int number) {
    System.out.println("Twice of " + number + " is " + (number * 2));}
    
    public static void displayNumberPlusFive(int number) {
    System.out.println(number + " plus 5 is " + (number + 5));}

    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is " + (number * number));}
}



