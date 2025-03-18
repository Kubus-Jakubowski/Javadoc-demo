package org.example;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.add(10, 5);
        double difference = calculator.subtract(10, 5);
        double product = calculator.multiply(10, 5);
        double quotient = calculator.divide(10, 5);

        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + product);
        System.out.println("Iloraz: " + quotient);
    }
}
