package org.example;

/**
 * Ta klasa robi różne rzeczy.
 * <p>To jest kalkulator</p>
 * </p>  <!-- Błąd: niepotrzebny znacznik zamykający -->
 */
public class Calculator {

    /**
     * Dodaje dwie liczby
     * @param a  <!-- Błąd: brak opisu parametru -->
     * @param b  <!-- Błąd: brak opisu parametru -->
     * @return wynik  <!-- Błąd: niejasny opis -->
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Odejmuje coś od czegoś.
     * @return odjęta liczba <!-- Błąd: metoda powinna zwracać wynik a - b, a opis jest niejasny -->
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Ta metoda mnoży liczby
     * @param a
     * @param b
     * @return wynik mnożenia <!-- Błąd: powinien być opis w formacie {@code a * b} -->
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Dzieli liczby.
     * @param a dzielona liczba
     * @param b dzielnik <!-- Brak informacji o błędzie dzielenia przez zero -->
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Oblicza średnią liczb
     * @param numbers <!-- Brak opisu, co to za liczby -->
     * @return <!-- Pusty @return, brak opisu wyniku -->
     */
    public double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
