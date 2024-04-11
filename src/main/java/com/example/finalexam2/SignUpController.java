package com.example.finalexam2;

import com.example.finalexam2.utils.ToolFxml;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SignUpController {
    @FXML
    public TextField registerUsername;
    @FXML
    public TextField registerPassword;
    @FXML
    public TextField confirmPassword;
    @FXML
    public Button buttonSignUpAccount;
    public AnchorPane signUpScreen;

    public void ReturnLogin () throws IOException {
        ToolFxml.openFXML("hello-view.fxml");
        ToolFxml.closeFXML(signUpScreen);

    }
    public void SignUpAccount () throws IOException {
        String name = registerUsername.getText();
        String pass = registerPassword.getText();
        String confirmPass = confirmPassword.getText();

        if(!pass.equals(confirmPass))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Thông Báo!");
            alert.setHeaderText("Mật Khẩu Không Khớp Nhau!");
            alert.setContentText("Xin Vui Lòng Thử Lại!");
            alert.showAndWait();
            return;
        }
        // Lưu thông tin đăng ký vào file txt
        try {
            List<String> lines = Files.readAllLines(Paths.get("account.txt"));
            for (String line : lines) {
                String[] acc = line.split(",");
                String username = acc[0];
                String password = acc[1];
                if(username.equals(name) && password.equals(pass)) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Thông Báo!");
                    alert.setHeaderText("Tài Khoản Đã Tồn Tại!");
                    alert.setContentText("Xin Vui Lòng Thử Lại!");
                    alert.showAndWait();
                    return;
                }
            }
        } catch (IOException error) {
            error.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter("account.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
             bufferedWriter.write(name + "," + pass + "," + "\n");
        } catch (IOException error) {
            error.printStackTrace();
            return;
        }
        ToolFxml.openFXML("hello-view.fxml");
        ToolFxml.closeFXML(signUpScreen);
    }

}