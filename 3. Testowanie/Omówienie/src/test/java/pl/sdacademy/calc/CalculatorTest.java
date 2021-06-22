package pl.sdacademy.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Przykładowa klasa z testami dla klasy Calculator.
public class CalculatorTest {
    @Test
    void shouldReturn4WhenAdding2And2() {
        // given (arrange)
        Calculator calculator = new Calculator();
        // when (act)
        int result = calculator.add(2, 2);
        // then (assert)
        assertEquals(4, result);
    }

    @Test
    void shouldReturn0WhenAddingOppositeNumbers() {
        // given (arrange)
        Calculator calculator = new Calculator();
        // when (act)
        int result = calculator.add(-3, 3);
        // then (assert)
        assertEquals(0, result);
    }
}
