package com.company;
//Метод endsWith
//Проверяет, кончается ли строка с заданным значением
public class Main {

    public static void main(String[] args)
    {
        String message = "Good morning";
        boolean a = message.endsWith("morning");
        boolean b = message.endsWith("evening");
        if (a == true)
        {
            System.out.println("Сообщение заканчивается на morning");
            System.out.println("a = "+ a);
        }
	    else if (b==true)
	    {
	        System.out.println("Сообщение заканчивается на evening");
        }
    }
}
