package com.example.CashingUpProgramV2;

import com.example.CashingUpProgramV2.application.CashingUpProgramV2Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

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
    @DisplayName("Test 1p field")
    public void test1pField() {
        String text = calculateActualSum("10", "#onePTextField", "#onePButton", "#onePLabel");
        assertEquals("£0.01 = £0.10", text);
    }

    @Test
    @DisplayName("Test 2p field")
    public void test2pField() {
        String text = calculateActualSum("10", "#twoPTextField", "#twoPButton", "#twoPLabel");
        assertEquals("£0.02 = £0.20", text);
    }

    @Test
    @DisplayName("Test 5p field")
    public void test5pField() {
        String text = calculateActualSum("10", "#fivePTextField", "#fivePButton", "#fivePLabel");
        assertEquals("£0.05 = £0.50", text);
    }

    @Test
    @DisplayName("Test 10p field")
    public void test10pField() {
        String text = calculateActualSum("10", "#tenPTextField", "#tenPButton", "#tenPLabel");
        assertEquals("£0.10 = £1.00", text);
    }

    @Test
    @DisplayName("Test 20p field")
    public void test20pField() {
        String text = calculateActualSum("5", "#twentyPTextField", "#twentyPButton", "#twentyPLabel");
        assertEquals("£0.20 = £1.00", text);
    }

    @Test
    @DisplayName("Test 50p field")
    public void test50pField() {
        String text = calculateActualSum("10", "#fiftyPTextField", "#fiftyPButton", "#fiftyPLabel");
        assertEquals("£0.50 = £5.00", text);
    }

    @Test
    @DisplayName("Test £1 field")
    public void test1PoundField() {
        String text = calculateActualSum("10", "#onePoundTextField", "#onePoundButton", "#onePoundLabel");
        assertEquals("£1.00 = £10.00", text);
    }

    @Test
    @DisplayName("Test £2 field")
    public void test2PoundField() {
        String text = calculateActualSum("10", "#twoPoundTextField", "#twoPoundButton", "#twoPoundLabel");
        assertEquals("£2.00 = £20.00", text);
    }

    @Test
    @DisplayName("Test £5 field")
    public void test5PoundField() {
        String text = calculateActualSum("10", "#fivePoundTextField", "#fivePoundButton", "#fivePoundLabel");
        assertEquals("£5.00 = £50.00", text);
    }

    @Test
    @DisplayName("Test £10 field")
    public void test10PoundField() {
        String text = calculateActualSum("10", "#tenPoundTextField", "#tenPoundButton", "#tenPoundLabel");
        assertEquals("£10.00 = £100.00", text);
    }

    @Test
    @DisplayName("Test £20 field")
    public void test20PoundField() {
        String text = calculateActualSum("10", "#twentyPoundTextField", "#twentyPoundButton", "#twentyPoundLabel");
        assertEquals("£20.00 = £200.00", text);
    }

    @Test
    @DisplayName("Test £50 field")
    public void test50PoundField() {
        String text = calculateActualSum("10", "#fiftyPoundTextField", "#fiftyPoundButton", "#fiftyPoundLabel");
        assertEquals("£50.00 = £500.00", text);
    }


}