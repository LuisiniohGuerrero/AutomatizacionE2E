// HomePage.java
package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target FIRST_PRODUCT = Target.the("First product").located(By.xpath("(//a[@class='hrefch'])[1]"));
    public static final Target SECOND_PRODUCT = Target.the("Second product").located(By.xpath("(//a[@class='hrefch'])[2]"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button").located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target CART_LINK = Target.the("Cart link").located(By.xpath("//a[contains(text(),'Cart')]"));
}