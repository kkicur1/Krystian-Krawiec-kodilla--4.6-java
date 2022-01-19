package com.kodilla.kalkulator;

public class Calculator {

    public double add(double a, double b) {
        return a+b;
    }

    public double substraction(double a, double b) {
        return a-b;
    }

    public static void main (String args[]) {
        Calculator calculator= new Calculator();
        double resultPlus=calculator.add(4,2);
        double resultMinus=calculator.substraction(3,1);
        System.out.println("Sum result is: "+ resultPlus);
        System.out.println("Substraction result is: "+ resultMinus);
    }
}
