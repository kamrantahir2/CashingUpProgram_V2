package com.example.CashingUpProgramV2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CashingUpProgramV2Controller {
    @FXML
    private Label label;
    @FXML
    private Button button;

    public void buttonPressed() {
        label.setText("BUTTON PRESSED!!!!");
    }

}