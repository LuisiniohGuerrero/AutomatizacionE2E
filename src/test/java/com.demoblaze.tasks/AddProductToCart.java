package com.demoblaze.tasks;

import com.demoblaze.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {
    private final Target product;

    public AddProductToCart(Target product) {
        this.product = product;
    }

    public static AddProductToCart forTheFirstProduct() {
        return instrumented(AddProductToCart.class, HomePage.FIRST_PRODUCT);
    }

    public static AddProductToCart forTheSecondProduct() {
        return instrumented(AddProductToCart.class, HomePage.SECOND_PRODUCT);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product),
                Click.on(HomePage.ADD_TO_CART_BUTTON)
        );
    }
}
