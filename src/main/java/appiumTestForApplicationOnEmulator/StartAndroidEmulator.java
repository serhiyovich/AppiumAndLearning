package appiumTestForApplicationOnEmulator;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.concurrent.TimeUnit;
@Slf4j
public class StartAndroidEmulator {
    private static String sdkPath = "C:\\Users\\shramko\\Downloads\\sdk-tools\\";// or for windows D:/Android/adt-bundle-windows-x86_64-20140702/sdk/
//    private static String adbPath = sdkPath + "platform-tools" + File.separator + "adb";
    private static String emulatorPath = sdkPath + "tools" + File.separator + "emulator";

    /**
     *  * Starts an emulator for the provided AVD name
     *  *
     *  * @param nameOfAVD
     *  
     */
    public static void launchEmulator(String nameOfAVD) {
        System.out.println("Starting emulator for '" + nameOfAVD + "' ...");
        String[] aCommand = new String[]{emulatorPath, "-avd", nameOfAVD};
        try {
            Process process = new ProcessBuilder(aCommand).start();
            process.waitFor(120, TimeUnit.SECONDS);
            System.out.println("Emulator launched successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
