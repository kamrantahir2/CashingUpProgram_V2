package com.example.CashingUpProgramV2.model;

import org.springframework.stereotype.Component;

@Component
public class Money {
    private int quantity;
    private double value;
    private double sum;

    public Money(int quantity, double value) {
        this.quantity = quantity;
        this.value = value;
        calculateSum();
    }

    public Money() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void calculateSum() {
        this.sum = this.quantity * this.value;
    }
}