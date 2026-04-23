package com.bnm;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        // ✅ Inputs given directly in code (different for each operation)
        int addA = 5, addB = 5;
        int subA = 5, subB = 3;
        int mulA = 3, mulB = 5;
        int divA = 10, divB = 2;

        System.out.println("Addition (" + addA + "," + addB + "): " + c.add(addA, addB));
        System.out.println("Subtraction (" + subA + "," + subB + "): " + c.subtract(subA, subB));
        System.out.println("Multiplication (" + mulA + "," + mulB + "): " + c.multiply(mulA, mulB));
        System.out.println("Division (" + divA + "," + divB + "): " + c.divide(divA, divB));
    }
}