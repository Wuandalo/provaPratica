package br.com.projeto.bean.interfaces;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public interface MobileApplication {

     AndroidDriver<WebElement> getDriver();
}