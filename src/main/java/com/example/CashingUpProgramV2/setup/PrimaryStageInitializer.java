package com.example.CashingUpProgramV2.setup;

import com.example.CashingUpProgramV2.CashingUpProgramV2Controller;
import com.example.CashingUpProgramV2.service.ControllerService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class PrimaryStageInitializer implements ApplicationListener<StageReadyEvent> {

    @Autowired
    private FxWeaver fxWeaver;

    @Autowired
    private ControllerService service;

    @Autowired
    public PrimaryStageInitializer(FxWeaver fxWeaver, ControllerService service) {
        this.fxWeaver = fxWeaver;
        this.service = service;
    }

    public PrimaryStageInitializer() {
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/scenebuilder.fxml");
        loader.setLocation(xmlUrl);
        loader.setController(new CashingUpProgramV2Controller(service));
        Parent root;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = event.stage;
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}