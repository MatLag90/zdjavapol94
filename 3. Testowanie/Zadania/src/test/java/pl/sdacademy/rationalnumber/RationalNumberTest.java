package pl.sdacademy.rationalnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {
//    Napisz test shouldReturnQuarterWhenMultiplyingTwoHalves, która przetestuje, czy dla mnożenia dwóch jednych drugich zwrócona zostanie ćwierć.
    @Test
    void shouldReturnQuarterWhenMultiplyingTwoHalves() {
        // given
        RationalNumber half = new RationalNumber(1, 2);
        // when
        RationalNumber result = half.multiply(half);
        // then
        assertEquals(1, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

//    R.2. Dodaj test shouldReturn0WhenGettingOppositionTo0 testującą metodę
//    zwracającą liczbę przeciwną.
    @Test
    void shouldReturn0WhenGettingOppositionTo0() {
        // given
        // Liczba wymierna jest równa zero, kiedy jej licznik jest zerem.
        RationalNumber zero = new RationalNumber(0, 1);
        // when
        RationalNumber result = zero.getOpposite();
        // then
        assertEquals(0, result.getNumerator());
    }
}
