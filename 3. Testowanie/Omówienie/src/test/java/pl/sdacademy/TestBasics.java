package pl.sdacademy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// Zerknij do pliku pom.xml - dodaliśmy zależność od JUnit jupiter.
// Aby stworzyć testy tworzymy klasę, w której umieścimy metody - testy.
public class TestBasics {
    // Metoda z adnotacją BeforeEach będzie wywołana przed każdym testem.
    // Metoda taka będzie służyła do przygotowania wspólnej części dla części given
    // każdego z testów w klasie.
    @BeforeEach
    void setUp() {
        System.out.println("Metoda wywoływana przed każdym testem");
    }

    // Analogicznie, jeśli metoda ma adnotację AfterEach, to będzie wywołana po każdym teście.
    // Metoda będzie służyła do "posprzątania" po testach.
    @AfterEach
    void tearDown() {
        System.out.println("Metoda wywoływana po każdym teście");
    }

    // Jeśli metoda klasy ma adnotację Test, to staje się testem. Możemy taki test uruchomić.
    // Wynik uruchomienia testu to pomyślność, brak pomyślności lub błąd podczas jego wykonywania.
    @Test
    void test1() {
    }

    @Test
    void test2() {
        // Asercja to sprawdzenie, czy wyrażenie jest prawdziwe.
        // Ostatnim etapem przeprowadzania testów będą asercje.
        // Poniżej przykład dokonania asercji z wykorzystaniem słówka kluczowego assert.
        // Zapisujemy po nim wyrażenie logiczne - jeśli jego wynik jest nieprawdziwy, to
        // wykonanie testu uznajemy za niepomyślne. Test przerwie swoje działanie w wyniku
        // wykonania błędnej asercji.
        assert 1 == 2;
    }

    @Test
    void test3() {
        // Asercji zwykle będziemy dokonywać z wykorzystaniem dedykowanych do tego metod
        // z różnych bibliotek.
        // Poniższa metoda sprawdzi, czy wynik działania (drugi parametr) jest równy spodziewanej
        // wartości (pierwszy parametr).
        assertEquals("abc", "xyz");
    }

    @Test
    void test4() {
        // Inne metody do dokonywania asercji:
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotEquals("abc", "xyz");
    }

    @Test
    void shouldReturnStringLength() {
        // Testy dzielimy na trzy fazy: given/when/then
        // lub alternatywnie arrange/act/assert
        // given (arrange) to część, w której przygotowujemy dane do testu.
        String string = "abcde";
        // when (act) to część, w której wykonujemy testowaną czynność (wywołujemy testowaną metodę).
        int result = string.length();
        // then (assert) to część, w której dokonujemy asercji - sprawdzamy wynik.
        assertEquals(5, result);
    }

    @Test
    // Za pomocą adnotacji DisplayName możemy okreslić, jak test będzie wyświetlany w prezentowaniu wyników.
    @DisplayName("Jakiś tam opis testu")
    void test5() {
    }

    @Test
    // Adnotacja Disabled wyłącza test (będzie on ignorowany).
    @Disabled
    void test6() {
    }
}
