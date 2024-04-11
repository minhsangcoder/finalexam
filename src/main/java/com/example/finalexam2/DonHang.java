package com.example.finalexam2;

public class DonHang {
    private String maSP;
    private String nameSP;
    private int soLuong;
    private double donGia;
    private double thanhTien;
    public DonHang(String maSP, String nameSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = tinhThanhTien(soLuong, donGia); // Calculate total price in constructor
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
        this.thanhTien = tinhThanhTien(soLuong, donGia); // Recalculate total price on quantity change
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
        this.thanhTien = tinhThanhTien(soLuong, donGia); // Recalculate total price on price change
    }

    public double getThanhTien() {
        return thanhTien;
    }

    private double tinhThanhTien(int soLuong, double donGia) {
        return soLuong * donGia;
    }
}
