package br.com.runTest;

import org.junit.runner.RunWith;

import br.com.projeto.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = {"pretty", "json:target/cucumber.json"},
        features = {"./src/test/resources/"}, glue = {
        "br.com.web.steps","br.com.mobile.steps",
        "br.com.projeto.configuration", "br.com.projeto.commons",
        "br.com.projeto.bean"},

        tags = {"@web"})

public class RunTest extends BaseTest{

}