package com.Princekumar4518.Selenium_Locators;

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


public class findLocatorsProject {

    @Description("Verify that with invalid Login , error message is display")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testVWOInvalidLogin() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        // Interect with email field
        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("abcd@1234");

        // Interect with password field
        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("097256@67");

        // Interect with Button
        WebElement loginbutton=driver.findElement(By.id("js-login-btn"));
       loginbutton.click();




// Getting error messsage

        WebElement errorMessage=driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");





        Thread.sleep(2000);
        driver.quit();

    }



}
