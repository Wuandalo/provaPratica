package br.com.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToDoWebPage {

    public ToDoWebPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='baseAddInput-addList' and @placeholder='New list']")
    private WebElement inputNewList;
    @FindBy(xpath = "//div[@class='sortable-lists']/descendant::div[@class='listFadeShrink-enter-done']")
    private List<WebElement> listListasCriadas;
    @FindBy(xpath = "//button[@aria-label='List options']")
    private WebElement buttonDetalhesLista;
    @FindBy(xpath = "//span[text()='Delete list']")
    private WebElement buttonDeleteList;
    @FindBy(xpath = "//input[@id='baseAddInput-addTask']")
    private WebElement inputNewTask;
    @FindBy(xpath = "//div[@class='tasks']/descendant::div[@class='taskItem theme-blue']")
    private List<WebElement> listTaskPendentes;
    @FindBy(xpath = "//div[@class='tasks']/descendant::div[@class='taskItem completed theme-blue']")
    private List<WebElement> listTasksConcluidas;
    @FindBy(xpath = "//span[@class,'checkBox big']")
    private List<WebElement> buttonConcluirTask;
    @FindBy(xpath = "//span[@class,'checkBox completed big']")
    private List<WebElement> labelTaskConcluida;
    @FindBy(xpath = "//span[@role='checkbox' and @aria-label='Mark task as important.']")
    private List<WebElement> buttonTaskImportante;
    @FindBy(xpath = "//span[@class='importanceButton color-theme' and @aria-label='Remove importance.']")
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