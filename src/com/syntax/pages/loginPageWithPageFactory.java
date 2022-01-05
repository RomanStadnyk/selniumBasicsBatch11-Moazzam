package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement password;
    @FindBy (id="btnLogin")
    public  WebElement loginBtn;

    public loginPageWithPageFactory(){
       PageFactory.initElements(driver,this);
    }
}
//break till 9:30