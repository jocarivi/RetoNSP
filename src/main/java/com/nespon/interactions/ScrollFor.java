package com.nespon.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.markers.CanBeSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollFor implements Interaction, CanBeSilent {

    private final WebElementFacade target;

    public ScrollFor(WebElementFacade target) {
        this.target = target;
    }

    public static Performable element(WebElementFacade target) {
        return instrumented(ScrollFor.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", target);
        actor.attemptsTo(
                WaitFor.time(1)
        );
    }

    @Override
    public boolean isSilent() {
        return true;
    }
}
