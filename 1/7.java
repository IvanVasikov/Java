package com.company;
//Округление чисел Java
//Вычисление максимального и минимального значения
public class Main {

    public static void main(String[] args)
    {
        float number = 5.25f;
        byte a = 10;
        byte b = -30;
        System.out.println(Math.round(number)); //Возвращает тип int
        System.out.println(Math.floor(number)); //Возвращает тип double
        System.out.println(Math.ceil(number)); //Возвращает тип double

        System.out.println(Math.max(a,b)); //Можно сравнивать любые числовые типы, но
        System.out.println(Math.min(a,b)); //возвращаться всегда будет тип double

    }
}
