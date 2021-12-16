package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        navigate
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

//        find the WebElement "drop down"
        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));

//        use the select class to select from drop down
        Select select = new Select(days);
//select the value from drop down using select by index
//        select.selectByIndex(1);
//
//        Thread.sleep(2000);
//
//        select.selectByIndex(2);
//
//        Thread.sleep(2000);
//
//        select.selectByIndex(7);


//        select by visible text
//        select.selectByVisibleText("Thursday");

//        Select by value\
        select.selectByValue("Wednesday");




    }


}
