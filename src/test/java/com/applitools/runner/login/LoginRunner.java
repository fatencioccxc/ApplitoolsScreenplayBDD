package com.applitools.login;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/login.feature",
        tags = "",
        glue = "com/applitools/login",
        snippets = SnippetType.CAMELCASE
)
public class LoginRunner {

}
