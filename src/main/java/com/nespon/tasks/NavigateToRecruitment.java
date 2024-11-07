package com.nespon.tasks;

import com.nespon.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToRecruitment implements Task {

    public static Performable section() {
        return instrumented(NavigateToRecruitment.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.RECRUITMENT_TAB)
        );
    }
}

