package com.Princekumar4518.Selenum_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitVSclose {
    public static void main(String[] args) throws InterruptedException {

         // Close - will close only current tab not the session

//        WebDriver driver=new ChromeDriver();
//        driver.get("https://google.com");
//        Thread.sleep(5000);
//
//        driver.close();





        // quit close all the tabs

        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);

        driver.quit();
    }
}
