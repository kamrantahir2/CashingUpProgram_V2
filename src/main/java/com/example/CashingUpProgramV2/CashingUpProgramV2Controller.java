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
    private Money oneP;
    private Money twoP;
    private Money fiveP;
    private Money tenP;
    private Money twentyP;
    private Money fiftyP;
    private Money onePound;
    private Money twoPound;
    private Money fivePound;
    private Money tenPound;

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
    @FXML
    private Button twoPButton;
    @FXML
    private Label twoPLabel;
    @FXML
    private TextField twoPTextField;
    @FXML
    private TextField fivePTextField;
    @FXML
    private Label fivePLabel;
    @FXML
    private Button fivePButton;
    @FXML
    private TextField tenPTextField;
    @FXML
    private Label tenPLabel;
    @FXML
    private Button tenPButton;
    @FXML
    private TextField fiftyPTextField;
    @FXML
    private Label fiftyPLabel;
    @FXML
    private Button fiftyPButton;
    @FXML
    private TextField onePoundTextField;
    @FXML
    private Label onePoundLabel;
    @FXML
    private Button onePoundButton;
    @FXML
    private TextField twoPoundTextField;
    @FXML
    private Label twoPoundLabel;
    @FXML
    private Button twoPoundButton;
    @FXML
    private TextField fivePoundTextField;
    @FXML
    private Label fivePoundLabel;
    @FXML
    private Button fivePoundButton;
    @FXML
    private TextField tenPoundTextField;
    @FXML
    private Label tenPoundLabel;
    @FXML
    private Button tenPoundButton;


    public CashingUpProgramV2Controller() {
        service = new ControllerService();
    }

    public CashingUpProgramV2Controller(ControllerService service) {
        this.service = service;
    }

    public void calculateOneP() {
        oneP = calculateSum(onePTextField, "£0.01 = £", onePLabel, 0.01);
    }

    public void calculateTwoP() {
        twoP = calculateSum(twoPTextField, "£0.02 = £", twoPLabel, 0.02);
    }

    public void calculateFiveP() {
        fiveP = calculateSum(fivePTextField, "£0.05 = £", fivePLabel, 0.05);
    }

    public void calculateTenP() {
        tenP = calculateSum(tenPTextField, "£0.10 = £", tenPLabel, 0.1);
    }

    public void calculateTwentyP() {
        twentyP = calculateSum(twentyPTextField, "£0.20 = £", twentyPLabel, 0.2);
    }

    public void calculateFiftyP() {
        fiftyP = calculateSum(fiftyPTextField, "£0.50 = £", fiftyPLabel, 0.5);
    }

    public void calculateOnePound() {
        onePound = calculateSum(onePoundTextField, "£1.00 = £", onePoundLabel, 1);
    }

    public void calculateTwoPound() {
        twoPound = calculateSum(twoPoundTextField, "£2.00 = £", twoPoundLabel, 2);
    }

    public void calculateFivePound() {
        fivePound = calculateSum(fivePoundTextField, "£5.00 = £", fivePoundLabel, 5);
    }

    public void calculateTenPound() {
        tenPound = calculateSum(tenPoundTextField, "£10.00 = £", tenPoundLabel, 10);
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

