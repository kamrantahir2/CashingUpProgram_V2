package com.example.CashingUpProgramV2.service;

import com.example.CashingUpProgramV2.model.Money;
import com.example.CashingUpProgramV2.model.Till;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerService {
    private Till till;

    public Till getTill() {
        return till;
    }

    public void setTill(Till till) {
        this.till = till;
    }

    public ControllerService() {
        till = new Till();
    }

    public ControllerService(Till till) {
        this.till = till;
    }


}