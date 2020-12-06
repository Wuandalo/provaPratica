package br.com.web.funcionalidades;

import br.com.projeto.commons.BaseTest;
import br.com.web.pages.ToDoWebPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToDoWebFuncionalidade extends BaseTest {

    public ToDoWebPage todoWebPage;

    public ToDoWebFuncionalidade(){
        todoWebPage = new ToDoWebPage(webDriver);
    }

    public void limparListas(){
        wait.until(ExpectedConditions.visibilityOfAllElements(todoWebPage.getListListasCriadas()));
        for (WebElement oListaExistente: todoWebPage.getListListasCriadas()){
            acessarLista(oListaExistente.getText());
            wait.until(ExpectedConditions.elementToBeClickable(todoWebPage.getButtonDetalhesLista()));
            todoWebPage.getButtonDetalhesLista().click();
            wait.until(ExpectedConditions.elementToBeClickable(todoWebPage.getButtonDeleteList()));
            todoWebPage.getButtonDeleteList().click();
            wait.until(ExpectedConditions.elementToBeClickable(todoWebPage.getButtonDeleteList()));
            todoWebPage.getButtonDeleteList().click();
        }
    }

    public void acessarLista(String sNomeLista){
        boolean bListaEncontrada=false;
        wait.until(ExpectedConditions.visibilityOfAllElements(todoWebPage.getListListasCriadas()));
        for (WebElement oListaExistente: todoWebPage.getListListasCriadas()){
            if (oListaExistente.getText().equals(sNomeLista)){
                oListaExistente.click();
                bListaEncontrada=true;
                break;
            }
        }

        if (!bListaEncontrada){
            Assert.fail("Lista "+sNomeLista+" não encontrada!");
        }
    }

    public void criarLista(String sNomeLista) {
        todoWebPage.getInputNewList().click();
        todoWebPage.getInputNewList().sendKeys(sNomeLista,Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfAllElements(todoWebPage.getListListasCriadas()));
    }

    public void validarCriacaoLista(String sNomeLista){
        boolean bListaCriada=false;
        wait.until(ExpectedConditions.visibilityOfAllElements(todoWebPage.getListListasCriadas()));
        for (WebElement oListaExistente: todoWebPage.getListListasCriadas()){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getXpath(oListaExistente))));
            if (oListaExistente.getText().contains(sNomeLista)){
                bListaCriada=true;
                break;
            }
        }
        if (!bListaCriada){
            Assert.fail("Lista "+sNomeLista+" não foi encontrada!");
        }
    }

    public void criarTask(String sNomeTask){
        wait.until(ExpectedConditions.elementToBeClickable(todoWebPage.getInputNewTask()));
        todoWebPage.getInputNewTask().click();
        todoWebPage.getInputNewTask().sendKeys(sNomeTask,Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfAllElements(todoWebPage.getListTaskPendentes()));
    }

    public void validarCriacaoTask(String sNomeTask){
        boolean bTarefaCriada=false;
        for (WebElement oTaskExistentes: todoWebPage.getListTaskPendentes()){
            wait.until(ExpectedConditions.visibilityOf(oTaskExistentes));
            if (oTaskExistentes.getText().contains(sNomeTask)){
                bTarefaCriada=true;
                break;
            }
        }
        if (!bTarefaCriada){
            Assert.fail("Tarefa "+sNomeTask+" não foi criada!");
        }

    }

}
