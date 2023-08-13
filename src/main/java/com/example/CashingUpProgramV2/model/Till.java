package com.example.CashingUpProgramV2.model;

import jakarta.persistence.*;

@Entity
@Table(name="till")
public class Till {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String nameid;
    @Column(name = "onep")
    private double oneP;
    @Column(name = "twop")
    private double twoP;
    @Column(name = "fivep")
    private double fiveP;
    @Column(name = "tenp")
    private double tenP;
    @Column(name = "twentyp")
    private double twentyP;
    @Column(name = "fiftyp")
    private double fiftyP;
    @Column(name = "onepound")
    private double onePound;
    @Column(name = "twopound")
    private double twoPound;
    @Column(name = "fivepound")
    private double fivePound;
    @Column(name = "tenpound")
    private double tenPound;
    @Column(name = "twentypound")
    private double twentyPound;
    @Column(name = "fiftypound")
    private double fiftyPound;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



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
        double sum = oneP + twoP + fiveP + tenP + twentyP + fiftyP + onePound + twoPound + fivePound + tenPound + twentyPound + fiftyPound;
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

    public double getOneP() {
        return oneP;
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

    public void setTwentyP(double twentyP) {
        this.twentyP = twentyP;
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
        calculateTotal();
    }

    public Till() {
    }
}