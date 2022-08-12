package com.example.databinding_mvvm;

public class Product {
    String pname;
    String txt;

    public Product(String pname, String txt) {
        this.pname = pname;
        this.txt = txt;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
