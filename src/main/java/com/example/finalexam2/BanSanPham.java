package com.example.finalexam2;

public class BanSanPham {
    private String name;
    private String code;
    private int quantityInStock;
    private double price;
    private int soluong;



    public BanSanPham(String name,String code,int quantityInStock,double price, int soluong){
        this.name = name;
        this.code = code;
        this.quantityInStock = quantityInStock;
        this.price = price;
        this.soluong = soluong;
    }


    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public int getQuantity(){
        return this.quantityInStock;
    }

    public double getPrice(){
        return this.price;
    }

    public int getSoLuong () {
        return this.soluong;
    }



}
