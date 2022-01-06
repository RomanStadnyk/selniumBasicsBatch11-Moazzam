package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class takingScreenShots {

    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //locate the user name
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
//locate the password
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

//send username
        username.sendKeys("Tester");
//  send      password
        password.sendKeys("tester");
//        locate the login btn and press enter
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

//        take screen shot
        TakesScreenshot ts=(TakesScreenshot) driver;
//        take screen shot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
//        we need to save the screenshot file in our computer

        try {
            FileUtils.copyFile(screenShot,new File("screen/ss/1.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
