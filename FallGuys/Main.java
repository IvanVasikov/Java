package com.company;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Desktop;
import java.io.File;
import  java.io.IOException;
import java.lang.Thread;
public class Main
{
    public static void main(String[] args) throws InterruptedException,AWTException,IOException
    {
        String FGPath = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\Fall Guys\\FallGuys_client_game.exe";
        File file =new File(FGPath);
        Desktop.getDesktop().open(file);
        Thread.sleep(75000);
        Robot bot= new Robot();
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        while (true)
        {
            bot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(1000);
            bot.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(300000);
            bot.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            bot.keyRelease(KeyEvent.VK_ESCAPE);
            bot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(1000);
            bot.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(10000);
            bot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(1000);
            bot.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(5000);

        }
    }
}


	


