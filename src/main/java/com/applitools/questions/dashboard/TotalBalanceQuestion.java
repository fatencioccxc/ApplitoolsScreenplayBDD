package com.applitools.questions.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import com.applitools.ui.dashboard.FinancialOverview;

public class TotalBalanceQuestion implements Question<String> {

    public static Question<String> value() {
        return new TotalBalanceQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverview.TOTAL_VALANCE).getText();
    }
}
