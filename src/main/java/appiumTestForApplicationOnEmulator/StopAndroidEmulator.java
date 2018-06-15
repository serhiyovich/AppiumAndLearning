package appiumTestForApplicationOnEmulator;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.concurrent.TimeUnit;
@Slf4j
public class StopAndroidEmulator {
    private static String sdkPath = "C:\\Users\\shramko\\Downloads\\sdk-tools\\";// or for windows D:/Android/adt-bundle-windows-x86_64-20140702/sdk/
    private static String adbPath = sdkPath + "platform-tools" + File.separator + "adb";
//    private static String emulatorPath = sdkPath + "tools" + File.separator + "emulator";

    public static void closeEmulator() {
        System.out.println("Killing emulator...");
        String[] aCommand = new String[] { adbPath, "emu", "kill" };
        try {
            Process process = new ProcessBuilder(aCommand).start();
            process.waitFor(1, TimeUnit.SECONDS);
            System.out.println("Emulator closed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
