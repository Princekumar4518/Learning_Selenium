package com.Princekumar4518.Selenum_Basics;

import io.qameta.allure.internal.shadowed.jackson.core.JsonToken;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InterectWithDropdowns {

    @Test
    public void testSelectDropdown() {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://testautomationpractice.blogspot.com/");

        driver.get("");
        driver.manage().window().maximize();

        WebElement selectDropdown=driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdownValue=new Select(selectDropdown);

        // Using selectByvisibleText()
        //dropdownValue.selectByVisibleText("India");


        // Using selectByValue()-- value= value attribute in particular webelement
        //dropdownValue.selectByValue("india");

        //Using IndexValue
         //dropdownValue.selectByIndex(2);

        //capture the options from the dropdown

       List<WebElement> option=dropdownValue.getOptions();
        System.out.println("No of Options= "+option.size());

//        for(int i=0;i<option.size();i++){
//            System.out.println(option.get(i).getText());
//        }


         for(WebElement optionvalue:option){
             System.out.println("Option "+optionvalue.getText());
         }

        
    }
}