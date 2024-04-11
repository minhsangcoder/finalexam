package com.example.finalexam2;

public class SanPham {
    public String nameSP;
    public String codeSP;
    public int quantityInStock;
    public double priceSP;

    public SanPham(String name,String code,int quantityInStock,double price){
        this.nameSP = name;
        this.codeSP = code;
        this.quantityInStock = quantityInStock;
        this.priceSP = price;
    }
    public String getName(){
        return this.nameSP;
    }
    public String getCode(){
        return this.codeSP;
    }
    public int getQuantityInStock(){
        return this.quantityInStock;
    }
    public double getPrice(){
        return this.priceSP;
    }
}
