package org.example;

/**
 * Klasa główna aplikacji, demonstrująca działanie kalkulatora.
 */
public class Main {

    /**
     * Główna metoda programu. Demonstracja działania klasy {@link Calculator}.
     *
     * @param args argumenty wiersza poleceń (niewykorzystywane)
     */
    public static void main(String[] args) {
        // Tworzymy obiekt kalkulatora
        Calculator calculator = new Calculator();

        // Przykładowe obliczenia
        double sum = calculator.add(10, 5);
        double difference = calculator.subtract(10, 5);
        double product = calculator.multiply(10, 5);
        double quotient = calculator.divide(10, 5);

        /*
         * Wyświetlamy wyniki obliczeń na konsoli.
         * Każda linia wyświetla wynik innej operacji.
         */
        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + product);
        System.out.println("Iloraz: " + quotient);
    }
}
