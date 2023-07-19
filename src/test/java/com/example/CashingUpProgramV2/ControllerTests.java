package com.example.CashingUpProgramV2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.loadui.testfx.GuiTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.loadui.testfx.Assertions.verifyThat;
import static org.loadui.testfx.controls.Commons.hasText;

@ExtendWith(ApplicationExtension.class)
public class ControllerTests extends ApplicationTest {
    Pane mainroot;
    Stage mainstage;
    Parent rootNode;

//    Setup Scene
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = CashingUpProgramV2Application.class.getResource("/scenebuilder.fxml");
        loader.setLocation(xmlUrl);
        loader.setController(new CashingUpProgramV2Controller());
        mainroot = loader.load();
        stage.setScene(new Scene(mainroot));
        mainstage = stage;
        rootNode = mainstage.getScene().getRoot();
    }

    @Test
    public void contextLoads() {

    }

    @Test
    @DisplayName("test submit button exists")
    public void hasSubmitButton() {
        Button button = from(rootNode).lookup("#twentyPButton").query();
        assertEquals("Submit".toLowerCase(), button.getText().toLowerCase());
    }

    @Test
    @DisplayName("Test TextField shows correct sum, Should be 1")
    public void testTextFieldShowsCorrectSum() {
        TextField textfield = from(rootNode).lookup("#twentyPTextField").query();
        textfield.setText("5");
        Button button = from(rootNode).lookup("#twentyPButton").query();
        button.fire();
        Label label = from(rootNode).lookup("#twentyPLabel").query();
        String text = label.getText();
        assertEquals("£0.20 = £1.00", text);
    }

}