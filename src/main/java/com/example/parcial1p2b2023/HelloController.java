package com.example.parcial1p2b2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Escena2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.show();

    }


}