package app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void sum() {
        double a = 4;
        double b = 2;
        assertEquals(6, calculator.sum(a,b));
    }

    @Test
    void subtract() {
        double a = 4;
        double b = 2;
        assertEquals(2, calculator.subtract(a,b));
    }

    @Test
    void multiply() {
        double a = 4;
        double b = 2;
        assertEquals(8, calculator.multiply(a,b));
    }

    @Test
    void divideNotZero() {
        double a = 4;
        double b = 2;
        assertEquals(2, calculator.divide(a,b));
    }
    @Test
    void divideByZero() {
        double a = 4.4;
        double b = 0;
        assertThrows(ArithmeticException.class,() -> calculator.divide(a,b));
    }
}