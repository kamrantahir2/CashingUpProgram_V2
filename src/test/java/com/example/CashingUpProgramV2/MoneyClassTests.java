package com.example.CashingUpProgramV2;

import com.example.CashingUpProgramV2.model.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyClassTests {

    @Test
    @DisplayName("Test calculateSum() method returns 1")
    public void testCalculatorSumMethodReturns1() {
        Money twentyP = new Money(5, 0.2);
        double twentyPSum = twentyP.getSum();
        assertEquals(1, twentyPSum);
    }

}