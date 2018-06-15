package appiumTestForApplicationOnEmulator;

import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
@Slf4j
public class SetCapabilitiesForConnection {
    public void connection() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Thread.sleep(10000);


        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy_S7_API_23");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.shutterfly");
        capabilities.setCapability("appActivity", "com.shutterfly.activity.ShutterflyMainActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(300000);

        Thread.sleep(300000);
        WebElement cartButton = driver.findElement(By.id("com.shutterfly:id/cart_icon"));
        cartButton.click();
        Thread.sleep(5000);

        WebElement getStartedButton = driver.findElement(By.id("com.shutterfly:id/empty_state_cta_button"));
        getStartedButton.click();

        Thread.sleep(5000);
        driver.quit();
    }
}



//        WebElement laynerLAyout = driver.findElement(By.xpath("\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.b[4]/android.widget.RelativeLayout/android.widget.ImageView"));
//        laynerLAyout.findElement(By.xpath("//*[@id='screenshotContainer']/div/div/div/div/div/div[56]")).click();
//        laynerLAyout.click();
//        searchButton.click();
//        WebElement getStartedButton = driver.findElement(By.id("com.shutterfly:id/btn_get_started"));
//        getStartedButton.click();

//        //WEBVIEW
//        Set<String> contextNames = driver.getContextHandles();
//        for (String contextName : contextNames) {
//            System.out.println(contextName);
//            if (contextName.contains("WEBVIEW")) {
//                driver.context(contextName);
//            }
//        }
//
//        //
//        System.out.println(driver.getPageSource());


//        capabilities.setCapability("automationName", "Selendroid");
//    @FindBy(id = "com.shutterfly:id/main_nav_tab_icon")
//    private WebElement searchButton;

//    @AndroidFindBy(uiAutomator = "Photos");
//    public WebElement photosButton;