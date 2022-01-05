package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class loginPageTest {

    public static void main(String[] args){
//        open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/validateCredentials

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

//        locate the Element and send keys
        LoginPage loginPage=new LoginPage();

        WebElement username = loginPage.userNameField;
        CommonMethods.sendText(username,"Admin");







//        loginPage.passwordField.sendKeys("Hum@nhhrm123");
//        loginPage.loginBtn.click();




    }
}
