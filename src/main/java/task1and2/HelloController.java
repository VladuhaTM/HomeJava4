package task1and2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Button swapButton;

    private boolean isForward = true;

    @FXML
    private Label label1;

    @FXML
    private Button buttonExtra;

    @FXML
    private TextField textFieldExtra;

    @FXML
    protected void onSwapButtonClick() {
        if (isForward) {
            textField2.setText(textField1.getText());
            textField1.clear();
            swapButton.setText("←");
        } else {
            textField1.setText(textField2.getText());
            textField2.clear();
            swapButton.setText("→");
        }
        isForward = !isForward;
    }

    @FXML
    protected void onCheckLabel1() {
        label1.setVisible(!label1.isVisible());
    }

    @FXML
    protected void onCheckButtonExtra() {
        buttonExtra.setVisible(!buttonExtra.isVisible());
    }

    @FXML
    protected void onCheckTextFieldExtra() {
        textFieldExtra.setVisible(!textFieldExtra.isVisible());
    }
}