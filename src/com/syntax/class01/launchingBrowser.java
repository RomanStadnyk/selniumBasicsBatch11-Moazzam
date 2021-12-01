package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

    public static void main (String[] args){

        //set the path to the driver Executable
        //for windows user we will use .exe but mac users dont need a .exe
        //Error:The driver executable does not exist: (refers that the path to your driver is not correct ) -->check the path
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        creating a object of ChromeDriver
        WebDriver driver =new ChromeDriver();

//        calling a get method to get to a particular website
        driver.get("http://www.google.com");

        //returns the current url loaded in the browser
        String url = driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is : " + url);

//        returns the title of the current page in the browser
        String title = driver.getTitle();
        System.out.println("The current title of the page is : "+ title);

//      close the browser
        driver.quit();


    }
}

