package com.company;
//Генерация случайных чисел
//Math.random по умолчанию имеет диапозон [0;1)
//Чтобы указать диапозон ( Math.random() * (b-a) ) + a
public class Main
{

    public static void main(String[] args)
    {
        int a = (int) (Math.random()*2+1);
        System.out.println(a);


    }
}
