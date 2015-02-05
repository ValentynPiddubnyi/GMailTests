package pages;

import common.Browser;

/**
 * Created by fil on 2/5/15.
 */
public class LoginPage {
    private String loginPageURL = "http://gmail.com";
    public void goToLoginPage(){
        Browser.getDriver().get(loginPageURL);
    }
}
