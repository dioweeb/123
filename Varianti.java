package com.example.project;


import java.util.ArrayList;

public class Varianti {
    String text1="";
    String text2="";
    String text3="";
    public Varianti( String text1, String text2, String text3){
        this.text1=text1;
        this.text2=text2;
        this.text3=text3;
    }
    public Varianti( String text1){
        this.text1=text1;
    }
    public Varianti( String text1, String text2){
        this.text1=text1;
        this.text2=text2;
    }

    public static Varianti[] w=new Varianti[100];
}

