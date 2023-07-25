package com.example.CashingUpProgramV2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Till {
    @Id
    private String nameid;

    private double oneP;
    private double twoP;
    private double fiveP;
    private double tenP;
    private double twentyP;
    private double fiftyP;
    private double onePound;
    private double twoPound;
    private double fivePound;
    private double tenPound;
    private double twentyPound;
    private double fiftyPound;

//    =======================================================================================

//    Methods









// ===============================================================================

//    Getters, Setters & Constructors

    public double getOneP() {
        return oneP;
    }

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }

    public void setOneP(double oneP) {
        this.oneP = oneP;
    }

    public double getTwoP() {
        return twoP;
    }

    public void setTwoP(double twoP) {
        this.twoP = twoP;
    }

    public double getFiveP() {
        return fiveP;
    }

    public void setFiveP(double fiveP) {
        this.fiveP = fiveP;
    }

    public double getTenP() {
        return tenP;
    }

    public void setTenP(double tenP) {
        this.tenP = tenP;
    }

    public double getTwentyP() {
        return twentyP;
    }

    public void setTwentyP(double twentyeP) {
        this.twentyP = twentyeP;
    }

    public double getFiftyP() {
        return fiftyP;
    }

    public void setFiftyP(double fiftyP) {
        this.fiftyP = fiftyP;
    }

    public double getOnePound() {
        return onePound;
    }

    public void setOnePound(double onePound) {
        this.onePound = onePound;
    }

    public double getTwoPound() {
        return twoPound;
    }

    public void setTwoPound(double twoPound) {
        this.twoPound = twoPound;
    }

    public double getFivePound() {
        return fivePound;
    }

    public void setFivePound(double fivePound) {
        this.fivePound = fivePound;
    }

    public double getTenPound() {
        return tenPound;
    }

    public void setTenPound(double tenPound) {
        this.tenPound = tenPound;
    }

    public double getTwentyPound() {
        return twentyPound;
    }

    public void setTwentyPound(double twentyPound) {
        this.twentyPound = twentyPound;
    }

    public double getFiftyPound() {
        return fiftyPound;
    }

    public void setFiftyPound(double fiftyPound) {
        this.fiftyPound = fiftyPound;
    }

    public Till(String nameid, double oneP, double twoP, double fiveP, double tenP, double twentyeP, double fiftyP, double onePound, double twoPound, double fivePound, double tenPound, double twentyPound, double fiftyPound) {
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
    }

    public Till() {
    }
}