package br.com.projeto.configuration;

import br.com.projeto.commons.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void beforeScenarioWeb(){
        initializeWebApplication();
    }

    @After(value = "@web")
    public void afterScenarioWeb(Scenario scenario) {
        embeddImagesInReportWeb(scenario);
        closeWeb();
    }

    private static void embeddImagesInReportWeb(Scenario scenario){
        try {
            File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            byte[] data = FileUtils.readFileToByteArray(scrFile);
            scenario.embed(data, "image/png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
