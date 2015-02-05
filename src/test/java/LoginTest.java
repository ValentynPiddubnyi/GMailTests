import common.Browser;
import org.junit.Test;
import pages.LoginPage;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by fil on 2/5/15.
 */
public class LoginTest {
    @Test
    public void login(){
        Browser.initDriver();
        new LoginPage().goToLoginPage();
        Browser.close();
    }

    @Test
    public void  faildTest(){
        assertTrue(false);
    }
}
