# Javadoc-demo

To jest projekt demonstracyjny, którego celem jest pokazanie, jak generować dokumentację JavaDoc na dwa sposoby:

- **Przy użyciu opcji w IntelliJ IDEA** – czyli poprzez menu narzędzi.
- **Przy użyciu poleceń Gradle** – czyli komend z linii poleceń.

---

## Wymagania

- **Java JDK** (zalecane JDK 11 lub nowsze)
- **IntelliJ IDEA** (Community lub Ultimate)
- **Gradle** (w projekcie korzystamy z Gradle Kotlin DSL – plik `build.gradle.kts`)

---

## Sposoby generowania JavaDoc

### 1. Generowanie JavaDoc w IntelliJ IDEA (przez GUI)

1. **Otwórz projekt** w IntelliJ IDEA.
2. Przejdź do menu:  
   **Tools > Generate JavaDoc...**
3. W oknie dialogowym:
   - **Wybierz zakres** – możesz określić, dla których pakietów czy plików chcesz wygenerować dokumentację.
   - **Ustaw Output Directory** – wskaż folder, do którego zostaną zapisane wygenerowane pliki (domyślnie np. `build/docs/javadoc`).
   - Możesz także **dodać dodatkowe opcje** (np. widoczność public, protected, package, private) czy inne argumenty linii poleceń, jeśli zajdzie taka potrzeba.
4. **Ustaw kodowanie na UTF-8** – aby upewnić się, że wygenerowana dokumentacja obsłuży poprawnie znaki specjalne (np. polskie znaki), w oknie **Generate JavaDoc** wejdź do sekcji **Command line arguments** i dodaj argument `-encoding UTF-8` To zapewni, że dokumentacja będzie poprawnie renderować znaki specjalne.
5. Kliknij **Generate**. Po zakończeniu procesu otwórz wygenerowany plik HTML w przeglądarce, aby przejrzeć dokumentację.

> **Wskazówka:** Jeśli pojawią się problemy z generowaniem dokumentacji, sprawdź konfigurację JDK w ustawieniach projektu: **File > Project Structure > Project** – upewnij się, że ustawiona jest właściwa wersja JDK.

---

### 2. Generowanie JavaDoc za pomocą Gradle

1. **Otwórz terminal** (wbudowany w IntelliJ lub zewnętrzny) i przejdź do katalogu głównego projektu.
2. Uruchom komendę:
   - Na systemie Linux/macOS:  
     ```bash
     ./gradlew javadoc
     ```
   - Na Windows (w przypadku użycia skryptu batch):  
     ```bash
     gradlew.bat javadoc
     ```
3. Po wykonaniu zadania dokumentacja zostanie wygenerowana w katalogu:  
   `build/docs/javadoc`
4. **Ustaw kodowanie na UTF-8** – w pliku `build.gradle.kts` upewnij się, że zadanie `javadoc` jest skonfigurowane do używania kodowania UTF-8. Można to zrobić, dodając następującą konfigurację:
   ```kotlin
   tasks.javadoc {
       options.encoding = 'UTF-8'
   }
---

## Gałęzie projektu
- main: zawiera poprawnie napisane komentarze JavaDoc – zobacz, jak należy to robić, aby dokumentacja była czytelna, zwięzła i profesjonalna.

- wrong_javadoc: zawiera niepoprawnie napisane komentarze JavaDoc – jest to przykład, jak nie pisać komentarzy, z błędami i złymi praktykami. Można przełączać się między tymi gałęziami, aby porównać poprawne i niepoprawne podejście do pisania dokumentacji.

> **Wskazówka:** Aby przełączyć się między gałęziami, użyj komendy Git: <br>
> git checkout main <br>
> git checkout wrong_javadoc

---

## Dodatkowe wskazówki 

- **Konfiguracja projektu:**  
  Upewnij się, że ustawienia projektu (JDK, Gradle) są poprawne. W IntelliJ IDEA sprawdź to w **File > Project Structure**.

- **Testowanie dokumentacji:**  
  Po wygenerowaniu dokumentacji warto otworzyć główny plik HTML (zazwyczaj `index.html` w folderze output) w przeglądarce, aby upewnić się, że wszystko jest poprawnie sformatowane.

- **Skróty klawiszowe:**  
  W IntelliJ IDEA przydatny może być skrót **Ctrl+Shift+A** (Windows/Linux) lub **Cmd+Shift+A** (macOS) – wpisz "Generate JavaDoc", aby szybko wywołać odpowiednią akcję.

- **Integracja z systemem kontroli wersji:**  
  Warto dodać wygenerowaną dokumentację do pliku `.gitignore`, aby nie trafiła do repozytorium (np. dodaj wpis `build/docs/javadoc`).

- **Dodatkowe opcje:**  
  Jeśli potrzebujecie zmienić widoczność dokumentowanych elementów, pamiętajcie o opcji `-private` (lub inne: `-public`, `-protected`, `-package`) przy generowaniu dokumentacji przez Gradle lub w oknie dialogowym w IntelliJ IDEA.

---

## Podsumowanie

Projekt **Javadoc-demo** demonstruje dwa podstawowe sposoby generowania dokumentacji JavaDoc:
- **GUI IntelliJ IDEA** – wygodne i intuicyjne generowanie dokumentacji poprzez menu **Tools > Generate JavaDoc...**
- **Polecenia Gradle** – automatyczne generowanie dokumentacji przy użyciu komendy `./gradlew javadoc`

Mam nadzieję, że te wskazówki okażą się pomocne i ułatwią Wam pracę z dokumentacją projektów Java.

---

