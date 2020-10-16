package com.company;
//метод toUpperCase
//Вовзращает строку большими буквами

//метод toLowerCase
//Возвращает строку маленькими буквами

//метод equals
//Проверяет, равны ли два объекта
public class Main {

    public static void main(String[] args)
    {
        String message = "Ахахаха лул";
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        String str1 = "Good morning";
        String str2 = "Good morning";
        String str3 = "Good evening";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        /* compareTo похожий метод. Но возвращает численное значение */

    }
}
