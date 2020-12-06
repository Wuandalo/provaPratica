package br.com.mobile.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToDoMobilePage {

    public ToDoMobilePage(WebDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "")
    private WebElement inputNewList;
    @AndroidFindBy(xpath = "")
    private List<WebElement> listListasCriadas;
    @AndroidFindBy(xpath = "")
    private WebElement buttonDetalhesLista;
    @AndroidFindBy(xpath = "")
    private WebElement buttonDeleteList;
    @AndroidFindBy(xpath = "")
    private WebElement inputNewTask;
    @AndroidFindBy(xpath = "")
    private List<WebElement> listTaskPendentes;
    @AndroidFindBy(xpath = "")
    private List<WebElement> listTasksConcluidas;
    @AndroidFindBy(xpath = "")
    private List<WebElement> buttonConcluirTask;
    @AndroidFindBy(xpath = "")
    private List<WebElement> labelTaskConcluida;
    @AndroidFindBy(xpath = "")
    private List<WebElement> buttonTaskImportante;
    @AndroidFindBy(xpath = "")
    private List<WebElement> labelTaskImportante;

    public WebElement getInputNewList() {
        return inputNewList;
    }

    public WebElement getButtonDeleteList() {
        return buttonDeleteList;
    }

    public List<WebElement> getListListasCriadas() {
        return listListasCriadas;
    }

    public WebElement getInputNewTask() {
        return inputNewTask;
    }

    public List<WebElement> getListTaskPendentes() {
        return listTaskPendentes;
    }

    public List<WebElement> getListTasksConcluidas() {
        return listTasksConcluidas;
    }

    public List<WebElement> getButtonConcluirTask() {
        return buttonConcluirTask;
    }

    public List<WebElement> getLabelTaskConcluida() {
        return labelTaskConcluida;
    }

    public List<WebElement> getButtonTaskImportante() {
        return buttonTaskImportante;
    }

    public List<WebElement> getLabelTaskImportante() {
        return labelTaskImportante;
    }

    public WebElement getButtonDetalhesLista() {
        return buttonDetalhesLista;
    }

}