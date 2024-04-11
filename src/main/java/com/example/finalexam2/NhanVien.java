package com.example.finalexam2;

public class NhanVien {
    private String nameNV;
    private String codeNV;
    private String dutyNV;

    public NhanVien (String name,String code,String duty){
        this.nameNV = name;
        this.codeNV = code;
        this.dutyNV = duty;
    }

    public String getName(){
        return this.nameNV;
    }

    public String getCode(){
        return this.codeNV;
    }

    public String getDuty(){
        return this.dutyNV;
    }
}
