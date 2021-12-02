package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {


    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("moazzamdkjs@gmail.com");
        driver.findElement(By.name("passs")).sendKeys("jsajhfjahfj");
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.linkText("Forgotten password?")).click();
         driver.findElement(By.partialLinkText("Forgotten")).click();
         driver.quit();

     }
}


