package com.nespon.tasks;

import com.nespon.interactions.WaitFor;
import com.nespon.ui.ApplicationStagePage;
import com.nespon.ui.DashboardPage;
import com.nespon.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteHiring implements Task {

    public static Performable process() {
        return instrumented(CompleteHiring.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String hiringManager = Text.of(ApplicationStagePage.HIRING_MANAGER_LABEL).asString().answeredBy(actor);
        actor.remember("hiringManager", hiringManager);

        actor.attemptsTo(
                Click.on(ApplicationStagePage.SHORTLIST_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON),
                ScheduleInterview.of(),
                Click.on(RecruitmentPage.SAVE_BUTTON),
                Click.on(ApplicationStagePage.MARK_PASSED_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON),
                Click.on(ApplicationStagePage.OFFER_JOB_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON),
                Click.on(ApplicationStagePage.HIRE_BUTTON),
                Click.on(RecruitmentPage.SAVE_BUTTON),
                Click.on(DashboardPage.RECRUITMENT_TAB),
                WaitFor.time(10)
        );
    }
}
