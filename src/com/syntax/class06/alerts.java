package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //enable the alert.

        driver.findElement(By.cssSelector("button#alert")).click();

        Thread.sleep(2000);

        //switch the focus of selenium

        Alert simpleAlert=driver.switchTo().alert();

        simpleAlert.accept();

        //handling confirmation alert

        driver.findElement(By.cssSelector("button#confirm")).click();

        Alert confirmationAlert = driver.switchTo().alert();

        System.out.println(confirmationAlert.getText());

        confirmationAlert.dismiss();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button#prompt")).click();

        Alert promptAlert=driver.switchTo().alert();

        promptAlert.sendKeys("Hello We need Sleep");

        promptAlert.accept();




    }


    }

