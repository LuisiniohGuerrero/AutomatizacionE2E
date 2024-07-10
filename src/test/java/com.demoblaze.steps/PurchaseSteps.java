package com.demoblaze.steps;

import com.demoblaze.tasks.AddProductToCart;
import com.demoblaze.tasks.ViewCart;
import com.demoblaze.tasks.CompletePurchaseForm;
import net.thucydides.core.annotations.Step;

public class PurchaseSteps {
    @Step
    public void addFirstProductToCart() {
        AddProductToCart.forTheFirstProduct();
    }

    @Step
    public void addSecondProductToCart() {
        AddProductToCart.forTheSecondProduct();
    }

    @Step
    public void viewCart() {
        ViewCart.contents();
    }

    @Step
    public void completePurchaseForm(String name, String country, String city, String creditCard, String month, String year) {
        CompletePurchaseForm.withDetails(name, country, city, creditCard, month, year);
    }
}