package br.com.mobile.funcionalidades;

import br.com.mobile.pages.ToDoMobilePage;
import br.com.projeto.commons.BaseTest;
import br.com.web.pages.ToDoWebPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToDoMobileFuncionalidade extends BaseTest {

    public ToDoMobilePage toDoMobilePage;

    public ToDoMobileFuncionalidade(){
        toDoMobilePage = new ToDoMobilePage(driver);
    }

}
