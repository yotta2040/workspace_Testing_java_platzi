package com.example.demo.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertEquals(priceCalculator.getTotal(),0.0);
    }

    @Test
    void total_is_the_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(12.5);
        priceCalculator.addPrice(32.5);

        assertEquals(priceCalculator.getTotal(),45.0);
    }

    @Test
    void apply_discount() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(100.0);
        priceCalculator.addPrice(50.0);
        priceCalculator.addPrice(50.0);

        priceCalculator.setDiscount(25);

        assertEquals(priceCalculator.getTotal(),150.0);
    }
}