package com.applitools.runner.login;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login",
        plugin = {"pretty"},
        tags = "@Login",
        glue = "com/applitools/stepDefinitions/login",
        snippets = CAMELCASE
)
class LoginRunner {

}
