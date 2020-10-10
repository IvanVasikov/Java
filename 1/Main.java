package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //ПЕРЕМЕННЫЕ
        //1. Целочисленные
        byte num1; // от -128 до 127, занимает 1 байт памяти
        short num2; // от -32768 до 32767, занимает 2 байта в памяти
        int num3;  // от -2147483648 до 2147483647, занимает 4 байта в памяти
        long num4; // от -9223372036854775808 до 9223372036854775807, занимает 8 байтов в памяти
        //2. С плавающей точкой
        float num5; // от -3.4Е +38 до 3.4Е +38, занимает 4 байта в памяти
        double num6;// от -1.7E + 308 до 1.7Е + 308 занимает 8 байтов в памяти
        //3. Символы
        char ch; // от 0 до 65536 занимает 2 байтв в памяти
        //4. Логические
        boolean check; //true или false
        //5. Строка
        String message;
        //Присваивание значений переменных
        num1 = 121;
        num2 = 32500;
        num3 = 2000000000;
        num4 = 3000000000l;
        num5 = 3.15f;
        num6 = 4.1323423d;
        ch = 'A';
        check = true;
        message = "Hello";
        //Вывод переменных в консоль
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(ch);
        System.out.println(check);
        System.out.println(message);

    }
}
