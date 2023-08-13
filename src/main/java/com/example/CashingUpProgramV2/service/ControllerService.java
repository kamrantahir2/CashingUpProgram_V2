package com.example.CashingUpProgramV2.service;

import com.example.CashingUpProgramV2.model.Money;
import com.example.CashingUpProgramV2.model.Till;
import com.example.CashingUpProgramV2.repository.TillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("controllerService")
public class ControllerService {

    @Autowired
    private TillRepository tillRepository;

    public ControllerService(TillRepository tillRepository) {
        this.tillRepository = tillRepository;
    }

    public ControllerService() {

    }

    public TillRepository getTillRepository() {
        return tillRepository;
    }

    public void setTillRepository(TillRepository tillRepository) {
        this.tillRepository = tillRepository;
    }

    public Till save(Till till) {
        tillRepository.save(till);
        System.out.println("SAVE ATTEMPTED");
        return till;
    }

}