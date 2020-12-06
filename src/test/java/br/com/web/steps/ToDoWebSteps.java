package br.com.web.steps;

import br.com.web.funcionalidades.ToDoWebFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import java.util.List;
import java.util.Map;

public class ToDoWebSteps {

    private final ToDoWebFuncionalidade toDoWebFuncionalidade;

    public ToDoWebSteps() {
        toDoWebFuncionalidade = new ToDoWebFuncionalidade();
    }

    @E("^limpar listas criadas anteriormente$")
    public void limparListasCriadasAnteriormente() {
        toDoWebFuncionalidade.limparListas();
    }

    @Quando("^acessar lista \"([^\"]*)\"$")
    public void acessarLista(String sNomeLista) {
        toDoWebFuncionalidade.acessarLista(sNomeLista);
    }

    @Então("^o usuário cria as listas$")
    public void oUsuárioCriaAsListas(DataTable oListas) {
        List<Map<String, String>> list = oListas.asMaps(String.class, String.class);
        for (Map<String, String> stringStringMap : list) {
            toDoWebFuncionalidade.criarLista(stringStringMap.get("listas"));
//            toDoWebFuncionalidade.validarCriacaoLista(stringStringMap.get("listas"));
        }
    }

    @Então("^o usuário cria as tarefas$")
    public void oUsuárioCriaAsTarefas(DataTable oTarefas) {
        List<Map<String, String>> list = oTarefas.asMaps(String.class, String.class);
        for (Map<String, String> stringStringMap : list) {
            toDoWebFuncionalidade.criarTask(stringStringMap.get("tarefas"));
//            toDoWebFuncionalidade.validarCriacaoTask(stringStringMap.get("tarefas"));
        }
    }

}
