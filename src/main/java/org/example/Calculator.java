package org.example;

/**
 * Klasa Calculator zapewnia podstawowe operacje matematyczne.
 * Obsługuje dodawanie, odejmowanie, mnożenie i dzielenie.
 * <p>
 * Przykład użycia:
 * <pre>
 *     {@code
 *     Calculator calc = new Calculator();
 *     double result = calc.add(5,3);
 *     System.out.println(result); // 8.0
 *     }
 * </pre>
 *
 * @author Jakub
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    /**
     * Dodaje dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma liczb {@code a} i {@code b}
     * @since 1.0
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Odejmuje dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return wynik odejmowania {@code a - b}
     * @since 1.0
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Mnoży dwie liczby.
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return iloczyn liczb {@code a * b}
     * @since 1.0
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dzieli pierwszą liczbę przez drugą.
     *
     * @param a dzielna
     * @param b dzielnik (nie może być zerem)
     * @return iloraz {@code a / b}
     * @throws ArithmeticException jeśli {@code b} wynosi 0
     * @since 1.0
     * <p>
     * Przykład obsługi wyjątku:
     * <pre>
     *     {@code
     *     try {
     *         int result = calculator.divide(10, 0);
     *     } catch (ArithmeticException e) {
     *         System.out.println("Błąd: " + e.getMessage());
     *     }
     *     }
     * </pre>
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero!");
        }
        return a / b;
    }
}
