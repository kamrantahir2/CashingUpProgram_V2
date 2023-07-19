package com.example.CashingUpProgramV2;

import com.example.CashingUpProgramV2.model.Money;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class CashingUpProgramV2Controller {
    private Money twentyP;

    @FXML
    private Button twentyPButton;
    @FXML
    private Label twentyPLabel;
    @FXML
    private TextField twentyPTextField;

    public Money getTwentyP() {
        return twentyP;
    }

    public void setTwentyP(Money twentyP) {
        this.twentyP = twentyP;
    }

    public Button getTwentyPButton() {
        return twentyPButton;
    }

    public void setTwentyPButton(Button twentyPButton) {
        this.twentyPButton = twentyPButton;
    }

    public Label getTwentyPLabel() {
        return twentyPLabel;
    }

    public void setTwentyPLabel(Label twentyPLabel) {
        this.twentyPLabel = twentyPLabel;
    }

    public TextField getTwentyPTextField() {
        return twentyPTextField;
    }

    public void setTwentyPTextField(TextField twentyPTextField) {
        this.twentyPTextField = twentyPTextField;
    }

    public void calculateTwentyP() {
        int quantity = Integer.parseInt(twentyPTextField.getText());
        twentyP = new Money(quantity, 0.2);
        twentyPLabel.setText("£0.20 = £" + formatSum(twentyP.getSum()));
    }


    public String formatSum(double sum) {
        return String.format("%.2f", sum);
    }

}

