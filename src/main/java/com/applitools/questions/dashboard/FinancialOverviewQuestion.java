package com.applitools.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import com.applitools.ui.dashboard.FinancialOverview;

public class FinancialOverviewQuestion {

    public static Question<String> creditAvailable() {
        return actor ->
                TextContent.of(FinancialOverview.CREDIT_AVAILABLE).viewedBy(actor).asString().toString().trim();
    }

    public static Question<String> totalBalance() {
        return actor ->
                TextContent.of(FinancialOverview.TOTAL_VALANCE).viewedBy(actor).asString().toString().trim();
    }
}
