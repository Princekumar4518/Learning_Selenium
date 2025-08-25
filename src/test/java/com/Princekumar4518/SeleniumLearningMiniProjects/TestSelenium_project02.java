package com.Princekumar4518.SeleniumLearningMiniProjects;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_project02 {
    @Description("Blocking ads in Youtube using Option Classes")
    @Test
    public void test_Project(){

        ChromeOptions chromeoption=new ChromeOptions();
        chromeoption.addArguments("--window-size=1920,1080");  // Full HD


        chromeoption.addExtensions(new File("src/test/java/com/Princekumar4518/Selenium/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver=new ChromeDriver(chromeoption);
        driver.get("https://www.youtube.com/watch?v=-YlmnPh-6rE&list=RD-YlmnPh-6rE&start_radio=1&ab_channel=RehaanRecords");

    }
}
