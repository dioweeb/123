package com.example.project;


import android.widget.Toast;

import static com.example.project.Main.in;
import static com.example.project.MainActivity.number;
import static com.example.project.Main.notEnd;
import static java.lang.System.out;

public class Situation {
    Situation[] n1=new Situation[10];
    public Situation(Character a){}
    Situation[] direction;
    String text;
    int origin,r1,r2,r3,r4;
    int variants=0;


    static  public void destination(int value,int r1,int r2,int r3,int r4){
        switch (value){
            case 1:{number=r1;break;}
            case 2:{number=r2;break;}
            case 3:{number=r3;break;}
            case 4:{number=r4;break;}
        }

    }
    static public void destination(int value,int r1,int r2,int r3){
        switch (value){
            case 1:{number=r1;break;}
            case 2:{number=r2;break;}
            case 3:{number=r3;break;}
        }
    }
   static public void destination(int value,int r1,int r2){
        switch (value){
            case 1:{number=r1;break;}
            case 2:{number=r2;break;}
        }
    }
    static public void destination(int value,int r1){
            number=r1;
    }


    public Situation (String text,int variants,int r1,int r2,int r3,int r4) {
        origin=number;
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
        this.r4=r4;
    }
    public Situation (String text,int variants,int r1,int r2,int r3) {
        origin=number;
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
        this.variants=variants;
    }
    public Situation (String text,int variants,int r1,int r2){
        origin=number;
        this.r1=r1;
        this.r2=r2;
        this.variants=variants;
    }
    public Situation (String text,int variants,int r1) {
        origin=number;
        number=r1;
        this.variants=variants;
    }

    public Situation (String text) {
        origin=number;
        notEnd=false;
        this.variants=variants;
    }

   // public Situation(Character a, Monsters b) {
     //   Fight f=new Fight(a,b);

//    }
}
