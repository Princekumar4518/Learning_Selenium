package com.Princekumar4518.Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loators2PatialAndLinkText {

    @Description("Verify VWO")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Test_VWOLoginPage() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();


         // LinkText - Full text Match
//        WebElement exectFullMatch=driver.findElement(By.linkText("Start a free trial"));
//        exectFullMatch.click();

        //PartialText
      WebElement partialMatch=driver.findElement(By.partialLinkText(" a free "));
      partialMatch.click();


    }
}