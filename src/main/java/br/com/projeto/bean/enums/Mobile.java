package br.com.projeto.bean.enums;

import br.com.projeto.bean.interfaces.MobileApplication;
import br.com.projeto.bean.interfaces.WebApplication;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Scanner;

public enum Mobile implements MobileApplication {

    MOBILE {
        @Override
        public AndroidDriver<WebElement> getDriver() {
            return getDriver("br.com.userede.cockpit",
                    "br.com.userede.cockpit.MainActivity");
        }
    };

    private AndroidDriver<WebElement> driver;

    public AndroidDriver<WebElement> getDriver(String appPackage, String appActivity) {
        try {
            driver = new AndroidDriver<>(getCapabilities(appPackage, appActivity));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return driver;
    }

    private DesiredCapabilities getCapabilities(String appPackage, String appActivity) throws IOException {
        Scanner scanner = new Scanner(Runtime.getRuntime()
                .exec(new String[]{"/bin/bash", "-l", "-c", "adb get-serialno"}).getInputStream());
        String deviceSerialNumver = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", MobilePlatform.ANDROID);
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("udid", deviceSerialNumver);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("systemPort", 8205);
        return capabilities;
    }
}
