package com.orangehrmlive.StepDefinitions;

import com.orangehrmlive.Driver.SeleniumWebDriver;
import com.orangehrmlive.Tasks.*;
import com.orangehrmlive.UserInterface.DashboardUi;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrmlive.UserInterface.AddCandidateUi.*;
import static com.orangehrmlive.UserInterface.CandidatesUi.*;
import static com.orangehrmlive.UserInterface.DashboardUi.SPAN_RECRUITMENT;
import static org.assertj.core.api.Assertions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import java.util.List;
import java.util.Map;

public class RecruitmentStepDefinitions {

    private Actor camilo = Actor.named("camilo");
    @Given("^I am on the OrangeHRM login page (.*)$")
    public void iAmOnTheOrangeHRMLoginPageHttpsOpensourceDemoOrangehrmliveComWebIndexPhpAuthLogin(String Url) {
       camilo.can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }

    @When("^I log in with the credentials$")
    public void iLogInWithTheCredentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        String login = credentials.get(0).get("login");
        String password = credentials.get(0).get("password");
        camilo.attemptsTo(Login.on(login,password));
    }

    @Then("^I should be redirected to the dashboard$")
    public void iShouldBeRedirectedToTheDashboard() {
       camilo.attemptsTo(
               WaitUntil.the(DashboardUi.IMG_PROFILE_PIC, isVisible()).forNoMoreThan(10).seconds()
       );

    }

    @When("^I navigate to the Recruitment section$")
    public void iNavigateToTheSection() {
        camilo.attemptsTo(Dashboard.on());

    }

    @When("^I click on the  Add button$")
    public void iClickOnTheAddButton() {
        camilo.attemptsTo(Recruitment.on());
    }

    @When("^I fill in the candidate details$")
    public void iFillInTheCandidateDetails() {
        camilo.attemptsTo(AddCandidate.on());

    }

    @When("^I submit the candidate information$")
    public void iSubmitTheCandidateInformation() {
       camilo.attemptsTo(
               Click.on(BTN_SAVE)
       );

    }

    @Then("^I should see the candidate listed$")
    public void iShouldSeeTheCandidateListed() {

        camilo.attemptsTo(
                WaitUntil.the(LABEL_NAME, isVisible()).forNoMoreThan(10).seconds()
        );
        String obtainedText = Text.of(LABEL_NAME).viewedBy(camilo).asString();
        assertThat(obtainedText.replaceAll("\\s",""))
                .isEqualTo("Juan Camilo Agudelo".replaceAll("\\s",""));
    }

    @When("^I select the candidate$")
    public void iSelectTheCandidate() {
       camilo.attemptsTo(
               Click.on(SPAN_RECRUITMENT)
       );

    }

    /*This Snippet I had to comment it because the flow which should follow this automation was failing
    and did not allow to continue to hire the candidate, in the git attached screenshots
    @When("^I mark the candidate as Hired$")
    public void iMarkTheCandidateAs() {


    }*/

    @Then("^the status of the candidate should be Hired$")
    public void theStatusOfTheCandidateShouldBe() {
        camilo.attemptsTo(
                VerifyCandidateStatus.forCandidate("Juan Camilo Agudelo")
        );
    }
}
