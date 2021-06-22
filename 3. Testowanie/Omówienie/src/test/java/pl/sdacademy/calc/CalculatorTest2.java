package pl.sdacademy.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Odpowiednik klasy CalculatorTest - z wykorzystaniem metody z adnotacją @BeforeEach.
public class CalculatorTest2 {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturn4WhenAdding2And2() {
        // given (arrange)
        // when (act)
        int result = calculator.add(2, 2);
        // then (assert)
        assertEquals(4, result);
    }

    @Test
    void shouldReturn0WhenAddingOppositeNumbers() {
        // given
        // when
        int result = calculator.add(-3, 3);
        // then
        assertEquals(0, result);
    }
}
