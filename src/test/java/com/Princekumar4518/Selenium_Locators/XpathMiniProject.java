package com.Princekumar4518.Selenium_Locators;

import com.Princekumar4518.CommonFunctions;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathMiniProject {
    @Description("Verify OrangeHRM Successfull Login ")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testHRMLoginPage(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement inputUsernameBox=driver.findElement(By.xpath("//input[@name='username']"));
        inputUsernameBox.sendKeys("admin");

        WebElement inputPasswordBox=driver.findElement(By.xpath("//input[@name='password']"));
        inputPasswordBox.sendKeys("Hacker@4321");

        WebElement loginButton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();
//
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement H6text=driver.findElement(By.xpath("//h6[text()='PIM']"));
        Assert.assertEquals(H6text.getText(),"PIM");


        driver.quit();




    }

}
