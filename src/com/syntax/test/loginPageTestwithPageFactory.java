package com.syntax.test;

import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.BaseClass;

public class loginPageTestwithPageFactory {

    public static void main(String[] args) {

//        open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

//        create an object of loginwithPageFactory

        loginPageWithPageFactory loginWPG= new loginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("HRM@nhrm123");
        loginWPG.loginBtn.click();

//        close browser
        BaseClass.tearDown();

    }
}
