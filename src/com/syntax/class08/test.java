package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        WebElement instaBtn = driver.findElement(By.xpath("//a[contains(@title, 'Instagram')]"));
        instaBtn.click();


        WebElement FollowInst = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        FollowInst.click();

        Set<String> allHandles = driver.getWindowHandles();

        Iterator<String> iterator = allHandles.iterator();

        while (iterator.hasNext()) {
            String InsPage = iterator.next();
            driver.switchTo().window(InsPage);
            if (InsPage.contains("Instagram")) {

            }
        }
        System.out.println(" The Title of the new window is" + driver.getTitle());

        driver.quit();
    }
    }

