package pl.sdacademy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExample {
    // AssertJ to biblioteka do wygodnego wykonywania asercji.
    // Aby skorzystać z AssertJ musimy dodać zależność od tej biblioteczki (patrz pom.xml).
    @Test
    void example() {
        // Aby użyć AssertJ wywołamy metodę assertThat. Jako argument przekażemy wartość, którą chcemy sprawdzać.
        // W zależności od typu argumentu zostanie zwrócony obiekt oferujący masę wygodnych metod, reprezentujących
        // asercje dla wartości tego typu.
        // Poniżej przykład testujący wartość typu int:
        int intResult = 10;
        assertThat(intResult)
                .isLessThan(15)
                .isEven()
                .isPositive();

        // Przykład sprawdzenia wartości typu String:
        String stringResult = "abcdefg";
        assertThat(stringResult)
                .isNotEmpty()
                .contains("cde")
                .hasSizeGreaterThan(4);
    }
}
