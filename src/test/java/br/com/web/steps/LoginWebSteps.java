package br.com.web.steps;

import br.com.web.funcionalidades.LoginWebFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;

public class LoginWebSteps {

    private final LoginWebFuncionalidade loginWebFuncionalidade = new LoginWebFuncionalidade();

    @Dado("^que o usuario acessa o site \"([^\"]*)\"$")
    public void queUsuarioEstaLogadoNoSite(String sSite) {
        loginWebFuncionalidade.acessaSite(sSite);
    }

    @E("^efetua login com email \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void efetuaLoginComEmailESenha(String sEmail, String sSenha) {
        loginWebFuncionalidade.efetuaLogin(sEmail,sSenha);
    }
}
