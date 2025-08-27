package com.Princekumar4518.SeleniumLearningMiniProjects;

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

public class LoginVerifyMiniProject {

    @Description("Verify Healthcare Successfull Login ")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testHealthcareVerifyLogin(){



        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement buttonClick=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        buttonClick.click();

        WebElement usernameBox=driver.findElement(By.id("txt-username"));
        usernameBox.sendKeys("John Doe");

        WebElement passwordBox=driver.findElement(By.xpath("//input[@id='txt-password']"));
        passwordBox.sendKeys("ThisIsNotAPassword");

        WebElement loginButton=driver.findElement(By.xpath("//button[@id='btn-login']"));
        loginButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement textMatch=driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(textMatch.getText(),"Make Appointment");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


           driver.quit();
    }
}
