package com.Princekumar4518.Selenum_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SwitchingInTabs {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();



        String title=driver.getTitle();
        String windowid=driver.getWindowHandle();
        System.out.println("Window ID "+windowid+ "Page Title" +title);

        WebElement applepage= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(" //a[@id='apple']"))));
        applepage.click();

        String title1=driver.getTitle();
        String windowid1=driver.getWindowHandle();
        System.out.println("Window ID "+windowid1+ "Page Title" +title1);











//        String title=driver.getTitle();
//        System.out.println(title);
//        Boolean res=driver.getWindowHandle().contains(title);
//        System.out.println("Result "+res);
//       Set<String> windowId= driver.getWindowHandles();
//       for(String IDs:windowId){
////           String title=driver.getTitle();
//
//
////           System.out.println(IDs);
////           System.out.println(driver.switchTo().window(IDs));
//
//           if(title.equals("Automation Testing Practice")){
//               System.out.println("Parent Window and their id = "+IDs);
//               System.out.println(driver.getCurrentUrl());
//           }
//           else{
////               driver.switchTo().window(IDs);
//               System.out.println("Child Window and their id = "+IDs);
//           }
//       }

      driver.quit();

    }
}
