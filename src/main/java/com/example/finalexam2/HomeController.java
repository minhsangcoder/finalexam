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

    public AnchorPane doanhThu;
    public AnchorPane nhanSu;
    public AnchorPane donHang;
    public AnchorPane thongTinSanPham;
    public TableView<SanPham> tableViewThongTinSanPham;

    public static ObservableList<SanPham> data = FXCollections.observableArrayList();
    public static ObservableList<NhanVien> dataNV = FXCollections.observableArrayList();
    public static ObservableList<DonHang> dataDonHang = FXCollections.observableArrayList();
    public TextField maSP;
    public TextField nameSP;
    public TextField quanSP;
    public TextField giaSP;
    public TextField SoLuong;
    public TableView<NhanVien> tableViewNhanVien;
    public TableView<DonHang> tableViewDonHang;
    public TextField maNhanVien;
    public TextField tenNhanVien;
    public TextField chucVu;

    public void initialize() {
        tableViewThongTinSanPham.setItems(data);
        tableViewNhanVien.setItems(dataNV);
        tableViewDonHang.setItems(dataDonHang);
    }


    private void show(AnchorPane paneToShow) {
        Object edit;
        List<AnchorPane> allPanes = Arrays.asList(nhanSu, donHang, doanhThu, thongTinSanPham);
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

    public void donHang(ActionEvent actionEvent) {
        show(donHang);
    }

    public void addSP(ActionEvent actionEvent) {
        String name = nameSP.getText();
        String code = maSP.getText();
        int quan = Integer.parseInt(quanSP.getText());
        double price = Double.parseDouble(giaSP.getText());
        data.add(new SanPham(name, code, quan, price));
    }

    public void removeSP(ActionEvent actionEvent) {
        //
        data.remove(tableViewThongTinSanPham.getSelectionModel().getSelectedItem());
    }

    public void removeNV(ActionEvent actionEvent) {
        dataNV.remove(tableViewNhanVien.getSelectionModel().getSelectedItem());
    }

    public void addDataNV(ActionEvent actionEvent) {
        dataNV.add(new NhanVien(maNhanVien.getText(), tenNhanVien.getText(), chucVu.getText()));
    }

    public void addToCart(ActionEvent actionEvent) {
        SanPham sp = tableViewThongTinSanPham.getSelectionModel().getSelectedItem();
        for (int i = 0; i < dataDonHang.size(); i++) {
            DonHang dh = dataDonHang.get(i);
            if (dh.getMaSP() == sp.getCode()) {
                dh.setSoLuong(dh.getSoLuong() + 1);
                dataDonHang.set(i, dh);
                return;
            }
        }
        dataDonHang.add(new DonHang(sp.getCode(), sp.getName(), 1, sp.getPrice()));
    }

    public void removeDonHang(ActionEvent actionEvent) {
        dataDonHang.remove(tableViewDonHang.getSelectionModel().getSelectedItem());
    }

    public void giamSoLuongSP(ActionEvent actionEvent) {
        DonHang d = tableViewDonHang.getSelectionModel().getSelectedItem();
        for (int i = 0; i < dataDonHang.size(); i++) {
            DonHang dh = dataDonHang.get(i);
            if (dh.getMaSP() == d.getCode()) {
                if (d.getSoLuong()==1) {
                    dataDonHang.remove(tableViewDonHang.getSelectionModel().getSelectedItem());
                }
                else {
                d.setSoLuong(d.getSoLuong() - 1);
                dataDonHang.set(i, d);
                }
                return;
            }
        }
    }
}