package com.example.finalexam2;

public class DoanhThu {
    private double thanhTien;
    public int STT;
    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    // Getter and setter for STT
    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

//    public DoanhThu(String maSP, String nameSP, int soLuong, double donGia) {
//        this.thanhTien = tinhThanhTien(soLuong, donGia); // Calculate total price in constructor
//    }

//    public void setNameSP(String nameSP) {
//        this.nameSP = nameSP;
//    }

//    public int getSoLuong() {
//        return soLuong;
//    }
//
//    public void setSoLuong(int soLuong) {
//        this.soLuong = soLuong;
//        this.thanhTien = tinhThanhTien(soLuong, donGia); // Recalculate total price on quantity change
//    }
//
//    public double getDonGia() {
//        return donGia;
//    }
//
//    public void setDonGia(double donGia) {
//        this.donGia = donGia;
//        this.thanhTien = tinhThanhTien(soLuong, donGia); // Recalculate total price on price change
//    }

//    public double getThanhTien() {
//        return thanhTien;
//    }
//
//    private double tinhThanhTien(int soLuong, double donGia) {
//        return soLuong * donGia;
//    }
}

