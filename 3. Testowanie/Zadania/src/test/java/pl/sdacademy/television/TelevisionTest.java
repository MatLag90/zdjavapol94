package pl.sdacademy.television;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TelevisionTest {
//    T.1. Stwórz testy shouldTurnOff oraz shouldTurnOn testujące
//    metody wyłączającą oraz włączającą telewizor.
    @Test
    void shouldTurnOff() {
        // given
        Television television = new Television(5, 10, 2, true);
        // when
        television.turnOff();
        // then
        assertFalse(television.isOn());
    }

//    T.2. Stwórz test shouldIncreaseVolume testującą pogłośnienie telewizora.
    @Test
    void shouldIncreaseVolume() {
        // given
        Television television = new Television(5, 10, 2, true);
        // when
        television.volumeUp();
        // then
        assertEquals(6, television.getVolume());
    }

//    T.3. Stwórz test shouldNotIncreaseMaxVolume testującą, czy pogłośnienie telewizora
//    o maksymalnej głośności poskutkuje (możesz dodać odpowiedni konstruktor na potrzeby testu).
    @Test
    void shouldNotIncreaseMaxVolume() {
        // given
        Television television = new Television(Television.MAX_VOLUME, 123, 5, true);
        // when
        television.volumeUp();
        // then
        assertEquals(Television.MAX_VOLUME, television.getVolume());
    }
}
