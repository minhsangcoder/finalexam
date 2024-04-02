package com.example.finalexam2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class NhanVien1 {
    public TableView<NhanVien> tableView;
    public static ObservableList<NhanVien> data = FXCollections.observableArrayList();
    public TextField maNV;
    public TextField nameNV;
    public TextField dutyNV;
    public void initialize(){
        TableView<NhanVien> tableView = new TableView<>();
        tableView.setItems(data);
    }

    public void addNV (ActionEvent actionEvent) {
        String name = nameNV.getText();
        String code = maNV.getText();
        String duty = dutyNV.getText();
        data.add(new NhanVien(name,code,duty));
    }

    public void removeNV(ActionEvent actionEvent) {
        data.remove(tableView.getSelectionModel().getSelectedItem());
    }
}
