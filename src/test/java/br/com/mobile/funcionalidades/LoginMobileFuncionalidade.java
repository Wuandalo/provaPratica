package br.com.mobile.funcionalidades;

import br.com.mobile.pages.LoginMobilePage;
import br.com.projeto.commons.BaseTest;
import br.com.web.pages.LoginWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginMobileFuncionalidade extends BaseTest {

    public LoginMobilePage loginMobilePage;

    public LoginMobileFuncionalidade(){
        loginMobilePage = new LoginMobilePage(driver);
    }

}
