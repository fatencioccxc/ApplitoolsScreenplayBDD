package stepDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.FinancialOverviewQuestion;
import tasks.Login.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition {

    private String actorName;

    @Before
    public void SetTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has an active account")
    public void hasAnActiveAccount(String actor) {
        this.actorName = actor;
    }

    @When("he sends their valid credentials")
    public void heSendsTheirValidCredentials() {
        theActorCalled(this.actorName).attemptsTo(
                Open.url("https://demo.applitools.com"),
                LoginTask.withCredentials("frank.atencio", "password")
        );
    }

    @Then("he should have access to manage his account")
    public void heShouldHaveAccessToManageHisAccount() {
        theActorInTheSpotlight().should(

                seeThat(
                    "The displayed credit available",
                    FinancialOverviewQuestion.creditAvailable(),
                    equalTo("$17,800")
                ),
                seeThat(
                        "The displayed total balance ",
                        FinancialOverviewQuestion.totalBalance(),
                        equalTo("$350")
                )

        );
    }
}
