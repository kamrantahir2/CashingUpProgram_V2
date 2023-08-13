package com.example.CashingUpProgramV2.repository;

import com.example.CashingUpProgramV2.model.Money;
import com.example.CashingUpProgramV2.model.Till;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface TillRepository extends CrudRepository<Till, Integer> {

}
