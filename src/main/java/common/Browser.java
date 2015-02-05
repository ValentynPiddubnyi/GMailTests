package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by fil on 2/5/15.
 */
public class Browser {
    private static WebDriver driver;

    public static void initDriver(){
        driver = new HtmlUnitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void close() {
        driver.close();
    }
}
