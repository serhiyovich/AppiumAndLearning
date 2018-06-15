import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class CheckNativeAppOrHybrid {
    public void check() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

//        capabilities.setCapability("automationName", "Selendroid");

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Galaxy S7 API 23");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.shutterfly");
        capabilities.setCapability("appActivity", "com.shutterfly.activity.ShutterflyMainActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //WEBVIEW
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName);
            if (contextName.contains("WEBVIEW")) {
                driver.context(contextName);
            }
        }
    }
}
