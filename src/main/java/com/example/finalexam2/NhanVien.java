package com.example.finalexam2;

public class NhanVien {
    private String name;
    private String code;
    private String duty;

    public NhanVien (String name,String code,String duty){
        this.name = name;
        this.code = code;
        this.duty = duty;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public String getDuty(){
        return this.duty;
    }
}
