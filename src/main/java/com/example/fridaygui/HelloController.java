package com.example.fridaygui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button n1;
    @FXML
    private Button plus;
    @FXML
    private TextField eq1;

    private int num1=0;

    @FXML
    protected void onOneClick(){
        // num1 = num1 + Integer.parseInt(n1.getText());
        // eq1.setText(String.valueOf(num1));

        eq1.setText( eq1.getText() + n1.getText());

    }

}