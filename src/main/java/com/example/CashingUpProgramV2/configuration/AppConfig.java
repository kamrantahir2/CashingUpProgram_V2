package com.example.CashingUpProgramV2.configuration;

import com.example.CashingUpProgramV2.CashingUpProgramV2Controller;
import com.example.CashingUpProgramV2.model.Till;
import com.example.CashingUpProgramV2.repository.TillRepository;
import com.example.CashingUpProgramV2.service.ControllerService;
import com.example.CashingUpProgramV2.setup.PrimaryStageInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Optional;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public ControllerService controllerService() {
        return new ControllerService();
    }

    @Bean
    @Scope("prototype")
    public CashingUpProgramV2Controller cashingUpProgramV2Controller() {
        return new CashingUpProgramV2Controller();
    }

    @Bean
    @Scope("prototype")
    public PrimaryStageInitializer primaryStageInitializer() {
        return new PrimaryStageInitializer();
    }

    @Bean
    @Scope("prototype")
    public TillRepository tillRepository() {
        return new TillRepository() {
            @Override
            public <S extends Till> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Till> Iterable<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Till> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public Iterable<Till> findAll() {
                return null;
            }

            @Override
            public Iterable<Till> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Till entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Till> entities) {

            }

            @Override
            public void deleteAll() {

            }
        };
    }

}