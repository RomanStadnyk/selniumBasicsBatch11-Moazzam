package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(name="txtPassword")
    public WebElement password;

    @FindBy(name="Submit")
    public WebElement loginbt;


    public  loginPageWithPageFactory(){

        PageFactory.initElements(driver,this);
    }

}
