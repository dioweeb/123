package com.example.project;


public class Equipment_Manager {
    int num;
    String name;
    String type;


    public  Equipment_Manager helm[]= new Equipment_Manager[20];
    public  Equipment_Manager chest[] = new Equipment_Manager[20];
    public  Equipment_Manager arms[] = new Equipment_Manager[20];
    public  Equipment_Manager legs[] = new Equipment_Manager[20];
    public  Equipment_Manager sword[] = new Equipment_Manager[20];
    public  Equipment_Manager shield[] = new Equipment_Manager[20];


    Equipment_Manager(String name,int num,String type){
        this.name=name;
        this.num=num;
        this.type=type;
    }


    int i;

    public static String setn[]={"Громовой Пустоши","Безымянного","Когтя дракона","Адского Крика","Безудержной Ненависти","Скелета","Полого","Огненного Лорда","Лунной Поляны","Упорного Тролля","Хищной Птицы","Воинственного карлика","Грома и молнии"};

    public static void generate(String type,Equipment_Manager a[]) {

        switch (type) {

            case "Щит": {
                int quality = 10;

                for (int n = 0; n < setn.length; n++) {
                    a[n] = new Equipment_Manager("Щит " + setn[(int) (Math.random() * 13)], (int) (quality), "Щит");
                    quality +=  (10+(int)(Math.random()*20));
                }
                break;
            }

            case "Меч": {
                int quality = 10;

                for (int n = 0; n < setn.length; n++) {
                    a[n] = new Equipment_Manager("Меч " + setn[(int) (Math.random() * 13)], (int) (quality), "Меч");
                    quality +=  (10+(int)(Math.random()*20));
                }
                break;
            }
            case "Шлем":{
                int quality = 10;
                for (int n = 0; n < setn.length; n++) {
                    a[n] = new Equipment_Manager( "Шлем "+setn[(int) (Math.random() * 13)], quality, "Шлем");
                    quality+=10+(int)(Math.random()*20);
                }
                break;
            }
            case "Доспех":{ int quality = 10;
                for (int n = 0; n < setn.length; n++) {

                    a[n] = new Equipment_Manager("Доспех " + setn[(int) (Math.random() * 13)], (quality), "Доспех");
                    quality +=(10+(int)(Math.random()*20));
                }
                break;
            }
            case "Поножи":{ int quality = 10;
                for (int n = 0; n < setn.length; n++) {

                    a[n] = new Equipment_Manager("Поножи " + setn[(int) (Math.random() * 13)], (int) (quality), "Поножи");
                    quality += (10+(int)(Math.random()*20));
                }
                break;
            }
            case "Наручи":{int quality = 10;
                for (int n = 0; n < setn.length; n++) {

                    a[n] = new Equipment_Manager("Наручи " + setn[(int) (Math.random() * 13)], (int) (quality), "Наручи");
                    quality += (10+(int)(Math.random()*20));
                }
                break;
            }
        }

    }

    @Override
    public String toString(){
        return name+" "+num;
    }
}

