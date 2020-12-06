package br.com.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {

    public LoginWebPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@class='button']/span[text()='Get started']")
    private WebElement buttonGetStarted;
    @FindBy(xpath = "//div[@role='heading' and text()='Sign in']")
    private WebElement labelSignIn;
    @FindBy(xpath = "//input[@type='email' and @name='loginfmt']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@type='submit' and @value='Next']")
    private WebElement buttonNext;
    @FindBy(xpath = "//div[@id='loginHeader' and text()='Enter password']")
    private WebElement labelEnterPassword;
    @FindBy(xpath = "//input[@name='passwd' and @type='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@type='submit' and @value='Sign in']")
    private WebElement buttonSignIn;
    @FindBy(xpath = "//svg[@id='loadingSpinner']")
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
