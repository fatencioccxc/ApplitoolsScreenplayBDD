package com.applitools.questions.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import com.applitools.ui.dashboard.FinancialOverview;

public class FinancialOverviewQuestion {

    public static Question<String> creditAvailable() {
        return actor ->
                TextContent.of(FinancialOverview.CREDIT_AVAILABLE).answeredBy(actor).toString().trim();
    }

    public static Question<String> totalBalance() {
        return actor ->
                TextContent.of(FinancialOverview.TOTAL_VALANCE).answeredBy(actor).toString().trim();
    }
}
