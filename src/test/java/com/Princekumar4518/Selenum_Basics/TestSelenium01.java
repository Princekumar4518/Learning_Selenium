package com.Princekumar4518.Selenum_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open VWO app and Verify the Title")
    @Test
    public void testVMOapp(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://vwo.com/");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/");

        driver.quit();


    }

}
