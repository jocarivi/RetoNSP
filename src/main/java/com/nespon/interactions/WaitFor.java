package com.nespon.interactions;

import net.serenitybdd.markers.CanBeSilent;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitFor implements Interaction, CanBeSilent {

    private final long timeInSeconds;

    public WaitFor(long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public static Performable time(long timeInSeconds) {
        return instrumented(WaitFor.class, timeInSeconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(TimeUnit.SECONDS.toMillis(timeInSeconds));
    }

    @Override
    public boolean isSilent() {
        return true;
    }
}
