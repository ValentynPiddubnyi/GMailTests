import common.Browser;
import org.junit.Test;
import pages.LoginPage;

/**
 * Created by fil on 2/5/15.
 */
public class LoginTests {
    @Test
    public void login(){
        Browser.initDriver();
        new LoginPage().goToLoginPage();
    }
}
