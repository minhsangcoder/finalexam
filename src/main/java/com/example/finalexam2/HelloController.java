package com.example.finalexam2;

import com.example.finalexam2.utils.ToolFxml;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class HelloController {

    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    public Button buttonLogin;
    public AnchorPane mainFormLogin;
    public Button buttonSignUp;

    /*public static void exportData(String SignUpUsername, String SignUpPassword) throws IOException {
        File dataFile = new File(filePath);

        // Tạo FileWriter và BufferedWriter
        FileWriter fileWriter = new FileWriter(dataFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Ghi dữ liệu vào tệp
        bufferedWriter.write(dataToExport);
        bufferedWriter.newLine();  // Thêm dòng mới sau dữ liệu

        // Đóng luồng
        bufferedWriter.close();
        fileWriter.close();

        System.out.println("Dữ liệu đã được xuất sang: " + filePath);
    }*/

    public void Login() throws IOException {

        String username1 = username.getText();
        String password1 = password.getText();
        if(username1.equals("trang") && password1.equals("linh"))
        {
            ToolFxml.openFXML("home.fxml");
            ToolFxml.closeFXML(mainFormLogin);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Thông Báo!");
            alert.setHeaderText("Tài Khoản Không Hợp Lệ");
            alert.setContentText("Xin Vui Lòng Thử Lại!");
            alert.showAndWait();
        }
    } }

  /*  public void SignUp() throws IOException {

        String username1 = username.getText();
        String password1 = password.getText();
        if(username1.equals("trang") && password1.equals("linh"))
        {
            ToolFxml.openFXML("home.fxml");
            ToolFxml.closeFXML(mainFormLogin);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Thông Báo!");
            alert.setHeaderText("Tài Khoản Không Hợp Lệ");
            alert.setContentText("Xin Vui Lòng Thử Lại!");
            alert.showAndWait();
        }
    }
}*/