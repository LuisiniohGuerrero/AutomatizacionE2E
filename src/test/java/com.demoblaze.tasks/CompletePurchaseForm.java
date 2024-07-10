// CompletePurchaseForm.java
package com.demoblaze.tasks;

import com.demoblaze.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePurchaseForm implements Task {
    private final String name;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;

    public CompletePurchaseForm(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    public static CompletePurchaseForm withDetails(String name, String country, String city, String creditCard, String month, String year) {
        return instrumented(CompletePurchaseForm.class, name, country, city, creditCard, month, year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CheckoutPage.NAME_FIELD),
                Enter.theValue(country).into(CheckoutPage.COUNTRY_FIELD),
                Enter.theValue(city).into(CheckoutPage.CITY_FIELD),
                Enter.theValue(creditCard).into(CheckoutPage.CREDIT_CARD_FIELD),
                Enter.theValue(month).into(CheckoutPage.MONTH_FIELD),
                Enter.theValue(year).into(CheckoutPage.YEAR_FIELD),
                Click.on(CheckoutPage.PURCHASE_BUTTON)
        );
    }
}