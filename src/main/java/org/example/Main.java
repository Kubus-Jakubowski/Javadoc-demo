package org.example;

/**
 * Klasa główna aplikacji, demonstrująca działanie kalkulatora.
 *
 * @see Calculator
 * @author Jakub
 * @version 1.0
 * @since 1.0
 */
public class Main {

    /**
     * Główna metoda programu. <br>
     * Demonstracja działania klasy {@link Calculator}.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Dodawanie: " + calc.add(10, 3));
        System.out.println("Odejmowanie: " + calc.subtract(10, 3));
        System.out.println("Mnożenie: " + calc.multiply(2, 3));

        try {
            System.out.println("Dzielenie: " + calc.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
