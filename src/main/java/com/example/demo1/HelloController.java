package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text output;

    @FXML
    private void num(ActionEvent event)
    {
        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);

    }

    @FXML
    private void del()
    {
        output.setText("");

    }

    @FXML
    private void zv()
    {
        output.setText("");
        output.setText("Я же не настоящий!!!");

    }


}

