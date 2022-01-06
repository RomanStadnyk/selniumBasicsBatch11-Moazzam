package com.syntax.test;

import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class loginPageTest {

    public static void main(String[] args){
//        open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

//       locate the elements on loginPage and send the username and password

        loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user =login.userName;
        CommonMethods.sendText(user,"Admin");

        WebElement pass=login.password;
        CommonMethods.sendText(pass,"whywhy");

        login.loginbt.click();

//        take screen shot
        CommonMethods.takeTheSs("loginPage");

//        close the browser
        BaseClass.tearDown();
    }
}
