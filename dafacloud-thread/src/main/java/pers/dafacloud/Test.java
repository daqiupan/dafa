package pers.dafacloud;

import org.apache.log4j.Logger;
import org.apache.http.cookie.Cookie;
import pers.dafacloud.concurrent.TestUserModule;
import pers.dafacloud.loginPage.LoginPage;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        //logger.info("test");
        LoginPage loginPage = new LoginPage();
        Cookie cookie = loginPage.getDafaCooike("dafai0001","123456");
    }
}
