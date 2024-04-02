package com.example.finalexam2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.Arrays;
import java.util.List;


public class HomeController {

    public AnchorPane khachHang;
    public AnchorPane doanhThu;
    public AnchorPane nhanSu;
    public AnchorPane donHang;
    public AnchorPane thongTinSanPham;
    public TableView<SanPham> tableView;

    public static ObservableList<SanPham> data = FXCollections.observableArrayList();
    public static ObservableList<NhanVien> dataNV = FXCollections.observableArrayList();
    public TextField maSP;
    public TextField nameSP;
    public TextField quanSP;
    public TextField giaSP;
    public TextField SoLuong;
    public TableView<NhanVien> tableViewNhanVien;
    public TextField maNhanVien;
    public TextField tenNhanVien;
    public TextField chucVu;

    public void initialize(){
        tableView.setItems(data);
        tableViewNhanVien.setItems(dataNV);
    }


    private void show(AnchorPane paneToShow) {
        Object edit;
        List<AnchorPane> allPanes = Arrays.asList(nhanSu, donHang, khachHang, doanhThu,thongTinSanPham);
        for (AnchorPane pane : allPanes) {
            if (pane != paneToShow) {
                pane.setVisible(false);
            } else {
                pane.setVisible(true);
            }
        }
    }

    public void doanhThu(ActionEvent actionEvent) {
        show(doanhThu);
    }

    public void nhanSu(ActionEvent actionEvent) {
        show(nhanSu);
    }
    public void thongTinSanPham(ActionEvent actionEvent) {
        show(thongTinSanPham);
    }
    public void khachHang(ActionEvent actionEvent) {
        show(khachHang);
    }
    public void donHang(ActionEvent actionEvent) {
        show(donHang);
    }

    public void addSP(ActionEvent actionEvent) {
        String name = nameSP.getText();
        String code = maSP.getText();
        int quan = Integer.parseInt(quanSP.getText());
        double price = Double.parseDouble(giaSP.getText());

        data.add(new SanPham(name,code,quan,price));
    }

    public void removeSP(ActionEvent actionEvent) {
        data.remove(tableView.getSelectionModel().getSelectedItem());
    }
    public void removeNV(ActionEvent actionEvent) {
        dataNV.remove(tableViewNhanVien.getSelectionModel().getSelectedItem());
    }

    public void addDataNV(ActionEvent actionEvent) {
        dataNV.add(new NhanVien(maNhanVien.getText(),tenNhanVien.getText(),chucVu.getText()));
    }
}
