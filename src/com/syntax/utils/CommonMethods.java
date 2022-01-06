package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static void sendText(WebElement element, String text){

        element.clear();
        element.sendKeys(text);
     }

/**
 *
 */
     public static void takeTheSs(String filename){

         TakesScreenshot ts=(TakesScreenshot) driver;

//         the screenshot is taken and the type is File
         File ss = ts.getScreenshotAs(OutputType.FILE);
//         save the screenshot in our computer
         try {
             FileUtils.copyFile(ss,new File("screenshot/POM/"+filename+".png"));
         }
         catch (IOException e) {
             e.printStackTrace();
         }

     }
}
