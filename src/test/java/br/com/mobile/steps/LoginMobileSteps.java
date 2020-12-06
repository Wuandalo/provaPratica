package br.com.mobile.steps;

import br.com.mobile.funcionalidades.LoginMobileFuncionalidade;
import br.com.web.funcionalidades.LoginWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;

public class LoginMobileSteps {

    private final LoginMobileFuncionalidade loginMobileFuncionalidade = new LoginMobileFuncionalidade();

    @Dado("^que o usuário efetua login no aplicativo com o email \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void efetuaLoginComEmailESenha(String sEmail, String sSenha) {
    }
}
