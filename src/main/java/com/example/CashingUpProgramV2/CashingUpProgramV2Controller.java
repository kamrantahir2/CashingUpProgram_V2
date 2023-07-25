package com.example.CashingUpProgramV2;

import com.example.CashingUpProgramV2.model.Money;
import com.example.CashingUpProgramV2.service.ControllerService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashingUpProgramV2Controller {
    private Money twentyP;
    private Money oneP;

    @Autowired
    private ControllerService service;

    @FXML
    private Button onePButton;
    @FXML
    private Label onePLabel;
    @FXML
    private TextField onePTextField;

    @FXML
    private Button twentyPButton;
    @FXML
    private Label twentyPLabel;
    @FXML
    private TextField twentyPTextField;

    public CashingUpProgramV2Controller() {
        service = new ControllerService();
    }

    public CashingUpProgramV2Controller(ControllerService service) {
        this.service = service;
    }

    public void calculateOneP() {
        oneP = calculateSum(onePTextField, "£0.01 = £", onePLabel, 0.01);
    }

    public void calculateTwentyP() {
        twentyP = calculateSum(twentyPTextField, "£0.20 = £", twentyPLabel, 0.2);
    }

    public Money calculateSum(TextField textField, String labelText, Label label, double value) {
        int quantity = Integer.parseInt(textField.getText());
        Money money = new Money(quantity, value);
        label.setText(labelText + formatSum(money.getSum()));
        return money;
    }

    public String formatSum(double sum) {
        return String.format("%.2f", sum);
    }

}

