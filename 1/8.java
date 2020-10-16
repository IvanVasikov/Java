package com.company;
//Метод length в Java
//Вовзращает длину строки

//Метод concat
//Добавляет одну строку в конец другой строки

//Метод charAt
//Возвращает символ стоящий на определенном индексе

//Метод substring
//Тоже самое что и charAt, но для строк

//Метод trim
//Позволяет удалить пробелы в начале и конце строки
public class Main {

    public static void main(String[] args)
    {
        String message = "Я ем картошку";
        System.out.println(message.length());

        message = message.concat(" c мясом");
        System.out.println(message);

        char ch1 = message.charAt(0);
        char ch5 = message.charAt(6);
        char ch13 = message.charAt(12);
        System.out.println(ch1);
        System.out.println(ch5);
        System.out.println(ch13);

        System.out.println(message.substring(2)); //Вывод строки но с индекса под номером 2
        System.out.println(message.substring(2,4)); //Вывод строки в диапазоне с индексами от 2 до 4

        String sentence = "   Hi, my name is Koneko   "; //Куча пробелов
        System.out.println(sentence.trim());             //При выводе пробелов не будет в начале и конце

    }
}
