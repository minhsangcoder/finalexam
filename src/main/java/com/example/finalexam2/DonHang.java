package com.example.finalexam2;

import com.example.finalexam2.BanSanPham;

public class DonHang extends BanSanPham {
    public DonHang (String code, String name, int quantityInStock, double price, int soluong) {
        super (code, name, quantityInStock, price, soluong);
        // super được sử dụng để tham chiếu đến lớp cha trực tiếp của lớp hiện tại.
        // Nó cho phép bạn truy cập các thuộc tính và phương thức của lớp cha mà không cần sử dụng tên lớp đầy đủ.
    }

    double TinhTien (DonHang donHang) {
        return (donHang.getSoLuong() * donHang.getPrice());
    }
}
