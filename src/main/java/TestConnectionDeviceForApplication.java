import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestConnectionDeviceForApplication {
    //    @FindBy(xpath = "//*[@aria-label='Google Search']")
//    private WebElement searchButton;
    @Test
    public void sampleTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "/Apps/Amazon/");
//        File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");

//
//        File appDir = new File("C:\\TestApks");
//        File app = new File(appDir, "WikipediaSample.apk");
        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("udid", Properties.udid);

//other caps
//        capabilities.setCapability("app", app.getAbsolutePath());


//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "SM-G950FD");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("appPackage", "com.samsung.android.contacts");
        capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        capabilities.setCapability("noReset", "true");
//        capabilities.setCapability("fullReset", "false");
//
//        capabilities.setCapability("appPackage", "com.android.chrome");
//        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
//        capabilities.setCapability("udid", "SM-G950FD");

//        WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    WebElement frameLayout = driver.findElement(By.className("android.widget.FrameLayout"));
//        frameLayout.findElement(By.className())
//    List<WebElement> QAreaResult = driver.findElements(By.xpath("//*[@class='r']"));



//        QAreaResult.stream(element).findFirst().equals(QAreaResult.)
        Thread.sleep(3000);
        driver.quit();
    }
}
