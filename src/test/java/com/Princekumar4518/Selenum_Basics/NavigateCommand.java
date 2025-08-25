package com.Princekumar4518.Selenum_Basics;

import com.Princekumar4518.CommonFunctions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateCommand {

    @Description("Open the URL")
    @Test
    public void testNavigation(){

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

    }
}
