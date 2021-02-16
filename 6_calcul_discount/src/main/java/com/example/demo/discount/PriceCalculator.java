package com.example.demo.discount;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double result = prices.stream().mapToDouble(price -> price).sum();

        double total_discount = result * discount/100;

        return result - total_discount;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
