/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersdemo2.java;

/**
 *
 * @author Phumlani Lubisi
 */
import java.util.Scanner; 
public class NumbersDemo2Java {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        input.close(); }

    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice of " + number + " is " + (number * 2));}

    public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus 5 is " + (number + 5));}

    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is " + (number * number));}
}
