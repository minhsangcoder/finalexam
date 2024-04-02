package com.example.finalexam2;

public class SanPham {
    private String name;
    private String code;
    private int quantityInStock;
    public double price;

    public SanPham(String name,String code,int quantityInStock,double price){
        this.name = name;
        this.code = code;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code;
    }
    public int getQuantityInStock(){
        return this.quantityInStock;
    }
    public double getPrice(){
        return this.price;
    }
}
