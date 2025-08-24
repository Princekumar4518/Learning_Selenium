package com.Princekumar4518.Selenum_Basics;

import com.Princekumar4518.CommonFunctions;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project  extends CommonFunctions {

    @Description("TC #01 Verify that the particular Text Present in the Website Or Not")
    @Test
    public void testVerifyText(){

        WebDriver driver=new ChromeDriver();

//        driver.get("https://katalon-demo-cura.herokuapp.com/");

       openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/" );

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }

        else {
            System.out.println("Test Case Failed");
            Assert.assertTrue(false);
        }


//        driver.quit();
closeBrowser(driver);








    }

}
