package br.com.mobile.steps;

import br.com.mobile.funcionalidades.ToDoMobileFuncionalidade;
import br.com.web.funcionalidades.ToDoWebFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import java.util.List;
import java.util.Map;

public class ToDoMobileSteps {

    private final ToDoMobileFuncionalidade toDoMobileFuncionalidade;

    public ToDoMobileSteps() {
        toDoMobileFuncionalidade = new ToDoMobileFuncionalidade();
    }

    @E("^excluir listas criadas anteriormente$")
    public void excluirListasCriadasAnteriormente() {
    }

    @Então("^o usuário cria as seguintes listas$")
    public void oUsuárioCriaAsSeguintesListas() {
    }

    @Quando("^acessar a lista \"([^\"]*)\"$")
    public void acessarALista(String sNomeLista) {
    }

    @Então("^o usuário cria as seguintes tarefas$")
    public void oUsuárioCriaAsSeguintesTarefas() {
    }
}
