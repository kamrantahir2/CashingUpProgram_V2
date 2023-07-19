package com.example.CashingUpProgramV2.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Till {
    private List<Money> moneyList;

    public Till(List<Money> moneyList) {
        this.moneyList = moneyList;
    }

    public Till() {
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void setMoneyList(List<Money> moneyList) {
        this.moneyList = moneyList;
    }
}