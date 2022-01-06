package com.syntax.test;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.BaseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashboardPageTest {

    public static void main(String[] args) {
//        1. open the browser and login
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
//        login
        loginPageWithPageFactory login=new loginPageWithPageFactory();
        WebElement user =login.userName;
        CommonMethods.sendText(user,"Admin");

        WebElement pass=login.password;
        CommonMethods.sendText(pass,"Hum@nhrm123");

        login.loginbt.click();

//        test the dashboard page for the Welcome Element task
        DashboardPage dashboard=new DashboardPage();
        WebElement message = dashboard.welcomeMessage;
        System.out.println(message.getText());

//   take the screen shot
        CommonMethods.takeTheSs("dashBoardPage");

    }

}
