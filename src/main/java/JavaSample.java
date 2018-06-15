import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.List;

public class JavaSample {

    public static final String USERNAME = "vitalii70";
    public static final String AUTOMATE_KEY = "3JDpsZNDauJYYGCzyz3e";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 7 Plus");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "10.3");
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com");





        System.out.println(driver.getTitle());
        driver.quit();

    }
}