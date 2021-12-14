package com.syntax.Review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

    public static void main(String[] args) {
        //set the path of the driver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("browser launched");

        driver.get("https://www.google.com/");

        //it returns the current url from the browser
        System.out.println(driver.getCurrentUrl());

        //it returns the title of the page
        System.out.println(driver.getTitle());


        driver.quit();

    }
}
