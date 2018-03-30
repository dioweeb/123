package com.example.project;

import android.util.Log;

import java.util.Scanner;

import static com.example.project.Varianti.w;
import static java.lang.System.out;


public class Main {

    public static void varian(){
        Log.d("variant","generate");
        w[0]=new Varianti("на первую","на вторую","на третью");
        w[2]=new Varianti("");
        w[3]=new Varianti("1","2","0");
    }

    static Scanner in =new Scanner(System.in);
    public static boolean notEnd=true;
    public static void igra(){




        Equipment_Manager helm[]= new Equipment_Manager[20];
        Equipment_Manager chest[] = new Equipment_Manager[20];
        Equipment_Manager arms[] = new Equipment_Manager[20];
        Equipment_Manager legs[] = new Equipment_Manager[20];
        Equipment_Manager sword[] = new Equipment_Manager[20];
        Equipment_Manager shield[] = new Equipment_Manager[20];


        Equipment_Manager.generate("Шлем",helm);
        Equipment_Manager.generate("Доспех",chest);
        Equipment_Manager.generate("Наручи",arms);
        Equipment_Manager.generate("Поножи",legs);
        Equipment_Manager.generate("Меч",sword);
        Equipment_Manager.generate("Щит",shield);


    }

}