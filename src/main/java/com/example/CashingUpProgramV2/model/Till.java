package com.example.CashingUpProgramV2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Till {
    private String nameid;

    private Money oneP;
    private Money twoP;
    private Money fiveP;
    private Money tenP;
    private Money twentyP;
    private Money fiftyP;
    private Money onePound;
    private Money twoPound;
    private Money fivePound;
    private Money tenPound;
    private Money twentyPound;
    private Money fiftyPound;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private double total;

//    =======================================================================================

//    Methods

    public void calculateTotal() {
        double sum = oneP.getSum() + twoP.getSum() + fiveP.getSum() + tenP.getSum() + twentyP.getSum() + fiftyP.getSum() + onePound.getSum() + twoPound.getSum() + fivePound.getSum() + tenPound.getSum() + twentyPound.getSum() + fiftyPound.getSum();
        this.total = sum;
    }








// ===============================================================================

//    Getters, Setters & Constructors

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }

    public Money getOneP() {
        return oneP;
    }

    public void setOneP(Money oneP) {
        this.oneP = oneP;
    }

    public Money getTwoP() {
        return twoP;
    }

    public void setTwoP(Money twoP) {
        this.twoP = twoP;
    }

    public Money getFiveP() {
        return fiveP;
    }

    public void setFiveP(Money fiveP) {
        this.fiveP = fiveP;
    }

    public Money getTenP() {
        return tenP;
    }

    public void setTenP(Money tenP) {
        this.tenP = tenP;
    }

    public Money getTwentyP() {
        return twentyP;
    }

    public void setTwentyP(Money twentyP) {
        this.twentyP = twentyP;
    }

    public Money getFiftyP() {
        return fiftyP;
    }

    public void setFiftyP(Money fiftyP) {
        this.fiftyP = fiftyP;
    }

    public Money getOnePound() {
        return onePound;
    }

    public void setOnePound(Money onePound) {
        this.onePound = onePound;
    }

    public Money getTwoPound() {
        return twoPound;
    }

    public void setTwoPound(Money twoPound) {
        this.twoPound = twoPound;
    }

    public Money getFivePound() {
        return fivePound;
    }

    public void setFivePound(Money fivePound) {
        this.fivePound = fivePound;
    }

    public Money getTenPound() {
        return tenPound;
    }

    public void setTenPound(Money tenPound) {
        this.tenPound = tenPound;
    }

    public Money getTwentyPound() {
        return twentyPound;
    }

    public void setTwentyPound(Money twentyPound) {
        this.twentyPound = twentyPound;
    }

    public Money getFiftyPound() {
        return fiftyPound;
    }

    public void setFiftyPound(Money fiftyPound) {
        this.fiftyPound = fiftyPound;
    }

    public Till(String nameid, Money oneP, Money twoP, Money fiveP, Money tenP, Money twentyeP, Money fiftyP, Money onePound, Money twoPound, Money fivePound, Money tenPound, Money twentyPound, Money fiftyPound) {
        this.nameid = nameid;
        this.oneP = oneP;
        this.twoP = twoP;
        this.fiveP = fiveP;
        this.tenP = tenP;
        this.twentyP = twentyeP;
        this.fiftyP = fiftyP;
        this.onePound = onePound;
        this.twoPound = twoPound;
        this.fivePound = fivePound;
        this.tenPound = tenPound;
        this.twentyPound = twentyPound;
        this.fiftyPound = fiftyPound;
        calculateTotal();
    }

    public Till() {
    }
}