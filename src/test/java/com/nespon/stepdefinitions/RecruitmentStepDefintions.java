package com.nespon.stepdefinitions;

import com.nespon.models.Candidate;
import com.nespon.models.User;
import com.nespon.questions.CandidateRecord;
import com.nespon.tasks.AddCandidate;
import com.nespon.tasks.CompleteHiring;
import com.nespon.tasks.Login;
import com.nespon.tasks.NavigateToRecruitment;
import com.nespon.ui.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

public class RecruitmentStepDefintions {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("user");
    }

    @Given("the recruitment manager is on the login page")
    public void theRecruitmentManagerIsOnTheLoginPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.browserOn().the(LoginPage.class)
        );
    }

    @When("they log in with valid credentials")
    public void theyLogInWithValidCredentials(DataTable dataTable) {
        List<Map<String, String>> userDataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> userData : userDataList) {
            User user = new User(
                    userData.get("username"),userData.get("password")
            );
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(user)
        );
        }
    }


    @And("they navigate to the Recruitment section")
    public void theyNavigateToTheRecruitmentSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToRecruitment.section()
        );
    }

    @And("they add a new candidate with valid details")
    public void theyAddANewCandidateWithValidDetails(DataTable dataTable) {
        List<Map<String, String>> candidateDataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> candidateData : candidateDataList) {
            Candidate candidate = new Candidate(
                    candidateData.get("firstName"),
                    candidateData.get("middleName"),
                    candidateData.get("lastName"),
                    candidateData.get("email"),
                    candidateData.get("contactNumber")
            );
            OnStage.theActorInTheSpotlight().attemptsTo(
                    AddCandidate.withDetails(candidate)
            );
        }
    }

    @And("they finish the complete the hiring process")
    public void theyFinishTheCompleteTheHiringProcess() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteHiring.process()
        );
    }

    @Then("they should see the candidate is hired")
    public void theyShouldSeeTheCandidateIsHired() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that("the candidate's data matches the filled forms and the status is 'Hired'", CandidateRecord.verify()).isEqualTo(true)
        );
    }

}
