package com.Princekumar4518.SeleniumLearningMiniProjects;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ValidaingWrongDebitCard {


    @Description("Verify OrangeHRM Successfull Login ")
    @Owner("Prince Kumar")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void testPaymentCard() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement usernameBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@id='username']")));
        usernameBox.sendKeys("augtest_040823@idrive.com");

        // WebElement passwordBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("  //input[@id='password']")));
        //        passwordBox.sendKeys("123456");

        WebElement passwordBox=driver.findElement(By.xpath("  //input[@id='password']"));
        passwordBox.sendKeys("123456");

        WebElement checkBox=driver.findElement(By.xpath(" //span[@class='id-checkmark']"));
        checkBox.click();

        WebElement loginButton= driver.findElement(By.xpath(" //button[@id='frm-btn']"));
        loginButton.click();





        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        String url= driver.getCurrentUrl();
        System.out.println("Getting url : "+ url);
        Assert.assertEquals(url,"https://www.idrive360.com/enterprise/account?upgradenow=true");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement cardnumberInput=driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardnumberInput.sendKeys("3742 454554 00126");

        WebElement expDate=driver.findElement(By.xpath("//input[@name='exp-date']"));
        expDate.sendKeys("05/2026");

        WebElement pinfield=driver.findElement(By.xpath("//input[@name='cvc']"));
        pinfield.sendKeys("1234");

        WebElement addressField=driver.findElement(By.xpath("//input[@name='billAddr']"));
        addressField.sendKeys("JP Nagar");

        WebElement postalCode=driver.findElement(By.xpath("//input[@id='upgradezipcode']"));
       postalCode.sendKeys("560089");

        driver.quit();
    }
}