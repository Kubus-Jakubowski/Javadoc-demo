package org.example;

/**
 * Klasa Calculator zapewnia podstawowe operacje matematyczne.
 * Obsługuje dodawanie, odejmowanie, mnożenie i dzielenie.
 * <p>
 *     Przykład użycia:
 *     <pre>
 *         {@code
 *         Calculator calc = new Calculator();
 *         double result = calc.add(5,3);
 *         System.out.println(result); //8.0
 *         }
 *     </pre>
 * @author Jakub
 * @version 1.0
 */

public class Calculator {

    /**
     * Dodaje dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma liczb {@code a} i {@code b}
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Odejmuje dwie liczby
     *
     * @param a pierwsza liczba
     * @param b druga liczb
     * @return wynik odejmowania {@code a - b}
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Dzieli pierwszą liczbę przez drugą
     *
     * @param a pierwsza liczba
     * @param b druga liczb
     * @return iloczyn liczb {@code a * b}
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dzieli pierwszą liczbę przez drugą
     *
     * @param a pierwsza liczba
     * @param b druga liczb
     * @return iloraz {@code a / b}
     * @throws ArithmeticException jeśli {@code b} wynosi 0
     */
    public int divide(int a, int b) {
        if (b == 0) {
            // Rzucamy wyjątek, jeśli użytkownik próbuje dzielić przez zero
            throw new ArithmeticException("Nie można dzielić przez zero!");
        }
        return a / b;
    }
}
