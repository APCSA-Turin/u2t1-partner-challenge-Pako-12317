package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("TI84");
        System.out.println(calc1.coordinatePair(5, 6));
        System.out.println(calc1.performOperation("+", 6, 4));
        System.out.println(calc1.performOperation("-", 6, 4));
        System.out.println(calc1.performOperation("/", 6, 4));
        System.out.println(calc1.performOperation("*", 6, 4));
        System.out.println(calc1.divisibleBy(124562, 4));
        System.out.println(calc1.absoluteValue(564412, 2414352));
        System.out.println(calc1.info());
    }
}
