package com.example.project;


import static java.lang.System.out;

public class Character {

    public void get_killed(Character a,Character b){
        a.money+=b.money;
        out.println(a.name+" убивает "+b.name+" и получает "+b.money+" лориков");
    }

    public static final int report(Character a,Character b){
        if (a.hps<=0){out.println(b.name+" убивает "+a.name);out.println(" ну тут и конец игры");return 1;}
        if (b.hps<=0){out.println(a.name+" убивает "+b.name);return 2;}
        return 0;
    }

    int atk;
    int hps;
    int money;
    int armor=0;
    int stamina=20;

    public void e_helm(Equipment_Manager a){
        armor-=cur_helm.num;
        cur_helm=a;
        armor+=cur_helm.num;
    }
    public void e_chest(Equipment_Manager a){
        armor-=cur_chest.num;
        cur_chest=a;
        armor+=cur_chest.num;
    }
    public void e_arms(Equipment_Manager a){
        armor-=cur_arms.num;
        cur_arms=a;
        armor+=cur_arms.num;
    }
    public void e_legs(Equipment_Manager a){
        armor-=cur_legs.num;
        cur_legs=a;
        armor+=cur_legs.num;
    }
    public void e_sword(Equipment_Manager a){
        atk-=cur_sword.num;
        cur_helm=a;
        atk+=cur_sword.num;
    }
    public void e_shield(Equipment_Manager a) {
        cur_shield = a;
    }


    String name="";

    Equipment_Manager cur_helm;
    Equipment_Manager cur_chest;
    Equipment_Manager cur_arms;
    Equipment_Manager cur_sword;
    Equipment_Manager cur_shield;
    Equipment_Manager cur_legs;

    public Character(int a,int h,int m,String n){
        this.atk=a;
        this.hps=h;
        this.money=m;
        this.name=n;

        cur_helm=new Equipment_Manager("Нет шлема",0,"Шлем");
        cur_chest=new Equipment_Manager("Нет доспеха",0,"Доспех");
        cur_arms=new Equipment_Manager("Нет наручей",0,"Наручи");
        cur_legs=new Equipment_Manager("Нет поножей",0,"Поножи");
        cur_sword=new Equipment_Manager("Нет оружия",0,"Меч");
        cur_shield=new Equipment_Manager("Нет щита",0,"Щит");


    }

    public void show_armor(Character character){
        out.println("     *****************     \n");
        out.println("Шлем: "+cur_helm.name);
        out.println("Доспех: "+cur_chest.name);
        out.println("Наручи: "+cur_arms.name);
        out.println("Поножи: "+cur_legs.name);
        out.println("Оружие: "+cur_sword.name);
        out.println("Щит: "+cur_shield.name+"\n");
        out.println("     *****************     ");
        out.println("Всего брони: "+armor);
    }


}
