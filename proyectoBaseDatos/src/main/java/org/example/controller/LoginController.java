package org.example.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


    public class LoginController {



        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField contraseniaUsuario;

        @FXML
        private Button ingresarbtn;

        @FXML
        private TextField nombreUsuario;

        @FXML
        void initialize() {
            assert contraseniaUsuario != null : "fx:id=\"contraseniaUsuario\" was not injected: check your FXML file 'Login.fxml'.";
            assert ingresarbtn != null : "fx:id=\"ingresarbtn\" was not injected: check your FXML file 'Login.fxml'.";
            assert nombreUsuario != null : "fx:id=\"nombreUsuario\" was not injected: check your FXML file 'Login.fxml'.";

        }

    }


