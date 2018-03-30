package com.example.project;


import android.util.Log;

import static com.example.project.Main.notEnd;
import static com.example.project.MainActivity.number;


public class Story {
   public static Situation[] sit=new Situation[20];
    public static void callSituation(){
        switch (number) {
            case 0:{sit[0]= new Situation( "прекрасный летний день", 3, 1,2,3);Log.d("case0","case0");break;}
            case 1:{sit[1] = new Situation("R.I.P.");Log.d("case1","case1");break;}
            case 2:{sit[2] = new Situation("не очень конец мема", 1,1);Log.d("case2","case2");break;}
            case 3:{sit[3] = new Situation("arwerer3", 3, 1,2, 0);Log.d("case3","case3");break;}
        }
    }

}