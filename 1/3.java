package com.company;
//Работа с константами
/* Задача:
Вычислить периметр круга при разных значениях:
1. R = 10 см
2. R = 25 см
 */
public class Main
{

    public static void main(String[] args)
    {
      final double pi = 3.1415d; //Константа pi
      double p1 = 2*pi*10;
      double p2 = 2*pi*25;
      System.out.println(p1);
      System.out.println(p2);

    }
}
