package com.bnm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, c.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, c.multiply(3, 5)); // ✅ correct
    }

    @Test
    void testDivide() {
        assertEquals(5, c.divide(10, 2)); // ✅ correct
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> c.divide(10, 0));
    }
}