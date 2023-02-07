package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;
import ui.Dashboard.FinancialOverview;

public class CreditAvailableQuestion implements Question<String> {

    public static Question<String> value() {
        return new CreditAvailableQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.CREDIT_AVAILABLE).getText();
    }
}
