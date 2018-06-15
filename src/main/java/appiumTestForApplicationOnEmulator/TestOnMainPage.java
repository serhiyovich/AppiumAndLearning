package appiumTestForApplicationOnEmulator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

@Slf4j
public class TestOnMainPage {//todo работает AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    @Test
    public void sampleTest() throws MalformedURLException, InterruptedException {
        StartAndroidEmulator.launchEmulator("Galaxy_S7_API_23_1");
        AppiumServerJava appiumServerJava = new AppiumServerJava();
        appiumServerJava.startServer();
        SetCapabilitiesForConnection setCapabilitiesForConnection = new SetCapabilitiesForConnection();
        setCapabilitiesForConnection.connection();
        appiumServerJava.stopServer();
        StopAndroidEmulator.closeEmulator();

    }
}
