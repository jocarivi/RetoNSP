package com.nespon.tasks;

import com.nespon.interactions.WaitFor;
import com.nespon.ui.ApplicationStagePage;
import com.nespon.ui.InterviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScheduleInterview implements Task {

    public static Performable of() {
        return instrumented(ScheduleInterview.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String date = getDate();
        actor.remember("date", date);

        actor.attemptsTo(
                Click.on(ApplicationStagePage.SCHEDULE_INTERVIEW_BUTTON),
                Enter.theValue("Nespon Interview").into(InterviewPage.TITLE_INPUT),
                Enter.theValue("a").into(InterviewPage.INTERVIEWER_INPUT),
                WaitFor.time(1),
                Click.on(InterviewPage.INTERVIEWER_OPTION),
                Enter.theValue(date).into(InterviewPage.DATE_INPUT),
                Enter.theValue(getTime()).into(InterviewPage.TIME_INPUT)
        );
    }

    public String getDate(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-dd-MM"));
    }

    public String getTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
    }
}
