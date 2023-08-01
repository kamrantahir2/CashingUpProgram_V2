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
import org.w3c.dom.Text;

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

    public String calculateActualSum(String textFieldText, String textFieldId, String buttonId, String labelId) {
        TextField textfield = from(rootNode).lookup(textFieldId).query();
        textfield.setText(textFieldText);
        Button button = from(rootNode).lookup(buttonId).query();
        button.fire();
        Label label = from(rootNode).lookup(labelId).query();
        return label.getText();
    }

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
    @DisplayName("Test 1p field")
    public void test1pField() {

    }


    @Test
    @DisplayName("Test 20p field")
    public void test20pField() {
        String text = calculateActualSum("5", "#twentyPTextField", "#twentyPButton", "#twentyPLabel");
        assertEquals("£0.20 = £1.00", text);
    }

}