package com.example.finalexam2;

import com.example.finalexam2.utils.ToolFxml;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    public Button btnlogin;
    public AnchorPane mainForm;

    public void login() throws IOException {

        String username1 = username.getText();
        String password1 = password.getText();
        if(username1.equals("trang") && password1.equals("linh"))
        {
            ToolFxml.openFXML("home.fxml");
            ToolFxml.closeFXML(mainForm);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Thông Báo!");
            alert.setHeaderText("Tài Khoản Không Hợp Lệ");
            alert.setContentText("Xin Vui Lòng Thử Lại!");
            alert.showAndWait();
        }
    }
}