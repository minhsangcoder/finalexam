package com.example.finalexam2;

import com.example.finalexam2.utils.ToolFxml;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HelloController {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    public Button buttonLogin;
    public AnchorPane mainFormLogin;
    public Button buttonSignUp;

    public void Login() throws IOException {

        String username1 = username.getText();
        String password1 = password.getText();

        try {
            List<String> lines = Files.readAllLines(Paths.get("account.txt"));
            for (String line : lines) {
                String[] acc = line.split(",");
                String username = acc[0];
                String password = acc[1];
                if(username.equals(username1) && password.equals(password1))
                {
                    ToolFxml.openFXML("home.fxml");
                    ToolFxml.closeFXML(mainFormLogin);
                    return;
                }
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Thông Báo!");
            alert.setHeaderText("Tài Khoản Không Hợp Lệ");
            alert.setContentText("Xin Vui Lòng Thử Lại!");
            alert.showAndWait();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    public void SignUp() throws IOException {
        ToolFxml.openFXML("register.fxml");
        ToolFxml.closeFXML(mainFormLogin);
    }


}