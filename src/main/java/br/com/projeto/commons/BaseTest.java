package br.com.projeto.commons;

import br.com.projeto.bean.enums.Web;
import br.com.projeto.bean.interfaces.MobileApplication;
import br.com.projeto.bean.interfaces.WebApplication;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static AndroidDriver<WebElement> driver;
    protected static WebDriverWait wait;
    protected static boolean initialized;
    protected static WebDriverWait shortWait;

    protected void initializeWebApplication(){
        webDriver = ((WebApplication) Web.CHROME).getDriver();
        webDriver.manage().window().fullscreen();
        wait = new WebDriverWait(webDriver, 15);
    }

    protected void initializeMobileApplication(MobileApplication mobileApplication, boolean reiniciar) {
        if (!initialized || reiniciar) {
            initialized = true;
            driver = mobileApplication.getDriver();
            wait = new WebDriverWait(driver, 300);
            shortWait = new WebDriverWait(driver, 15);
        }
    }

    public String getXpath(WebElement element) {
        String str = element.toString();
        String[] listString = new String[0];
        if (str.contains("xpath")) {
            listString = str.split("xpath:");
        } else if (str.contains("id")) {
            listString = str.split("id:");
        }
        String last = listString[1].trim();
        return last.substring(0, last.length() - 1).replaceAll("}","");
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
