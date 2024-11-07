package com.nespon.tasks;

import com.nespon.models.Candidate;
import com.nespon.ui.CandidatePage;
import com.nespon.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import java.io.File;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCandidate implements Task {
    private final Candidate candidate;

    public AddCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public static Performable withDetails(Candidate candidate) {
        return instrumented(AddCandidate.class, candidate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String vacancy = "Payroll Administrator";
        actor.remember("vacancy", vacancy);
        actor.remember("fullName", candidate.getFullName());

        actor.attemptsTo(
                Click.on(RecruitmentPage.ADD_BUTTON),
                Enter.theValue(candidate.getFirstName()).into(CandidatePage.FIRST_NAME_INPUT),
                Enter.theValue(candidate.getMiddleName()).into(CandidatePage.MIDDLE_NAME_INPUT),
                Enter.theValue(candidate.getLastName()).into(CandidatePage.LAST_NAME_INPUT),
                Click.on(CandidatePage.VACANCY_DROPDOWN),
                Click.on(CandidatePage.VACANCY_WITH_OPTION.of(vacancy)),
                Enter.theValue(candidate.getEmail()).into(CandidatePage.EMAIL_INPUT),
                Enter.theValue(candidate.getPhone()).into(CandidatePage.PHONE_INPUT),
                Upload.theFile(Paths.get(getFile())).to(CandidatePage.RESUME_INPUT),
                Enter.theValue("QA").into(CandidatePage.KEYWORDS_INPUT),
                Enter.theValue("Reto Nespon").into(CandidatePage.NOTES_INPUT),
                Click.on(CandidatePage.CONSENT_CHECKBOX),
                Click.on(RecruitmentPage.SAVE_BUTTON)
        );
    }

    public String getFile(){
        return System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "files" + File.separator + "prueba.txt";
    }
}

