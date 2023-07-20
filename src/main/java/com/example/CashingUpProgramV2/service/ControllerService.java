package com.example.CashingUpProgramV2.service;

import com.example.CashingUpProgramV2.model.Money;
import com.example.CashingUpProgramV2.model.Till;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerService {
    private Till till;
    private List<Money> moneyList;

    public Till getTill() {
        return till;
    }

    public void setTill(Till till) {
        this.till = till;
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public void setMoneyList(List<Money> moneyList) {
        this.moneyList = moneyList;
    }

    public ControllerService() {
        till = new Till();
        moneyList = new ArrayList<>();
    }

    public ControllerService(Till till, List<Money> moneyList) {
        this.till = till;
        this.moneyList = moneyList;
    }

    public void addToMoneyList(Money money) {
        moneyList.add(money);
    }

    public void saveTill() {
        this.till.setMoneyList(moneyList);
    }
}