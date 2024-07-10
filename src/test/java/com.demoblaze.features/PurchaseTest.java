package com.demoblaze.features;

import com.demoblaze.steps.PurchaseSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class PurchaseTest {
    @Steps
    PurchaseSteps purchaseSteps;

    @Test
    public void shouldBeAbleToPurchaseItemsSuccessfully() {
        purchaseSteps.addFirstProductToCart();
        purchaseSteps.addSecondProductToCart();
        purchaseSteps.viewCart();
        purchaseSteps.completePurchaseForm("John Doe", "USA", "New York", "1234567812345678", "07", "2024");
    }
}