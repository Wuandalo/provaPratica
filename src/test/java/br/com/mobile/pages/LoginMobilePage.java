package br.com.mobile.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMobilePage {

    public LoginMobilePage(WebDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "")
    private WebElement buttonGetStarted;
    @AndroidFindBy(xpath = "")
    private WebElement labelSignIn;
    @AndroidFindBy(xpath = "")
    private WebElement inputEmail;
    @AndroidFindBy(xpath = "")
    private WebElement buttonNext;
    @AndroidFindBy(xpath = "")
    private WebElement labelEnterPassword;
    @AndroidFindBy(xpath = "")
    private WebElement inputPassword;
    @AndroidFindBy(xpath = "")
    private WebElement buttonSignIn;
    @AndroidFindBy(xpath = "")
    private WebElement labelSpiner;

    public WebElement getButtonGetStarted() {
        return buttonGetStarted;
    }

    public WebElement getLabelSignIn() {
        return labelSignIn;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getButtonNext() {
        return buttonNext;
    }

    public WebElement getLabelEnterPassword() {
        return labelEnterPassword;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSignIn() {
        return buttonSignIn;
    }

    public WebElement getLabelSpiner() {
        return labelSpiner;
    }


}
