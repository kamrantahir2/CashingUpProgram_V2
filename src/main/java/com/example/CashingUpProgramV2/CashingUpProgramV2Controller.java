package com.example.CashingUpProgramV2;

import com.example.CashingUpProgramV2.model.Money;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CashingUpProgramV2Controller {
    private Money twentyP;

    @FXML
    private Button twentyPButton;
    @FXML
    private Label twentyPLabel;
    @FXML
    private TextField twentyPTextField;

    public void calculateTwentyP() {
        int quantity = Integer.parseInt(twentyPTextField.getText());
        twentyP = new Money(quantity, 0.2);
        twentyPLabel.setText("£0.20 = £" + formatSum(twentyP.getSum()));
    }


    public String formatSum(double sum) {
        return String.format("%.2f", sum);
    }

}

