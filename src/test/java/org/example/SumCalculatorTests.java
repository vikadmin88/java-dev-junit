package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTests {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testSum1Return1() {
        //When
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSum3Return6() {
        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSum0OrNegativeReturnIllegalArgumentException() {
        //When-Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(-1));
    }
}