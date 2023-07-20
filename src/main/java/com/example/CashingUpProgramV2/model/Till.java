package com.example.CashingUpProgramV2.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Till {
    private List<Money> moneyList;

    public Till(List<Money> moneyList) {
        this.moneyList = moneyList;
    }

    public Till() {
        moneyList = new ArrayList<>();
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void setMoneyList(List<Money> moneyList) {
        this.moneyList = moneyList;
    }
}