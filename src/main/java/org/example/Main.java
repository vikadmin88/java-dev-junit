package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        System.out.println("calc.sum(1) = " + calc.sum(1));
        System.out.println("calc.sum(3) = " + calc.sum(3));
        System.out.println("calc.sum(-1) = " + calc.sum(-1));
    }
}