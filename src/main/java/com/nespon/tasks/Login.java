package com.nespon.tasks;

import com.nespon.models.User;
import com.nespon.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private final User user;

    public Login(User user) {
        this.user = user;
    }

    public static Performable withCredentials(User user) {
        return instrumented(Login.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(LoginPage.USERNAME_INPUT),
                Enter.theValue(user.getPassword()).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}

