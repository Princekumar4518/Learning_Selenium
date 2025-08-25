package com.Princekumar4518;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public ChromeDriver driver;

    // Opening Browser
    public void openBrowser(WebDriver driver,String Url){
        driver.get(Url);
    }

    //Closing Browser
    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
}
