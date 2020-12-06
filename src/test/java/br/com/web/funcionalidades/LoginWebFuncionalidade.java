package br.com.web.funcionalidades;

import br.com.projeto.commons.BaseTest;
import br.com.web.pages.LoginWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginWebFuncionalidade extends BaseTest {

    public LoginWebPage loginWebPage;

    public LoginWebFuncionalidade(){
        loginWebPage = new LoginWebPage(webDriver);
    }

    public void acessaSite(String site){
        webDriver.get(site);
    }

    public void efetuaLogin(String sEmail, String sSenha){
        wait.until(ExpectedConditions.elementToBeClickable(loginWebPage.getButtonGetStarted()));
        loginWebPage.getButtonGetStarted().click();
        wait.until(ExpectedConditions.visibilityOf(loginWebPage.getInputEmail()));
        loginWebPage.getInputEmail().sendKeys(sEmail);
        loginWebPage.getButtonNext().click();
        wait.until(ExpectedConditions.visibilityOf(loginWebPage.getInputPassword()));
        loginWebPage.getInputPassword().sendKeys(sSenha);
        loginWebPage.getButtonSignIn().click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(getXpath(loginWebPage.getLabelSpiner()))));
    }

}
