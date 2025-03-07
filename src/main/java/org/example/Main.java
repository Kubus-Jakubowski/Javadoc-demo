package org.example;

/**
 * Klasa Main <!-- Opis jest zbyt ogólny, brak informacji o celu klasy -->
 */
public class Main {

    /**
     * Uruchamia program.
     * @param args <!-- Brak opisu, co robią argumenty -->
     * @return void <!-- Błąd: metoda main nie zwraca wartości, więc @return jest zbędny -->
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Dodaje 5 do 3
        double result = calc.add(5, 3);  // Komentarz nic nie wnosi, bo wynik jest oczywisty

        // Wyświetla wynik
        System.out.println(result);
    }
}
