package com.company;
import java.util.Scanner;
//Условный оператор if. Оператор switch
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 3");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        /*if (number == 1) {
            System.out.println("Вы ввели число 1");
        }
        else if (number == 2){
            System.out.println("Вы ввели число 2");
        }
        else if (number == 3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
      */
        switch(number)
        {
            case 1: System.out.println("Вы ввели 1"); break;
            case 2: System.out.println("Вы ввели 2");break;
            case 3: System.out.println("Вы ввели 3");break;
            default:System.out.println("Вы ввели неверное число");
        }
    }
}
