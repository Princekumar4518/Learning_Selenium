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

public class LearningLocatorsMiniProject03 {

    @Description("Verify VWO Set Free Trial Account error message")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testFreeTrailProject() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement partialMatch=driver.findElement(By.partialLinkText(" a free "));
        partialMatch.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("abc");

        WebElement inputcheckBox=driver.findElement(By.name("gdpr_consent_checkbox"));
        inputcheckBox.click();

        WebElement partialbuttontext=driver.findElement(By.partialLinkText("a Free Trial"));
        partialbuttontext.click();


        WebElement errorMessage=driver.findElement(By.className("invalid-reason"));
       errorMessage.getText();

        Assert.assertEquals(errorMessage.getText(),"The email address you entered is incorrect.");



        driver.quit();
    }
}