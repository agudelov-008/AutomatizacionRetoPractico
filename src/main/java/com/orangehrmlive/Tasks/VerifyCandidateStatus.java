package com.orangehrmlive.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyCandidateStatus implements Task {

    private final String candidateName;
    private static final String EXPECTED_STATUS = "Application Initiated";
    public VerifyCandidateStatus(String candidateName) {
        this.candidateName = candidateName.trim().replaceAll("\\s+", " ");
    }

    private Target CANDIDATE_ROW() {
        return Target.the("candidate row")
                .located(By.xpath("//div[@class='oxd-table-body']//div[contains(normalize-space(), '" + candidateName + "')]/ancestor::div[@role='row']"));
    }

    private Target STATUS_COLUMN() {
        return Target.the("status column")
                .located(By.xpath("//div[@class='oxd-table-body']//div[contains(normalize-space(), '" + candidateName + "')]/ancestor::div[@role='row']//div[@role='cell'][contains(normalize-space(), 'Application Initiated')]"));
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CANDIDATE_ROW())
        );

        String statusText = Text.of(STATUS_COLUMN()).viewedBy(actor).asString();

        if (EXPECTED_STATUS.equals(statusText)) {
            System.out.println("Test Passed: Status is 'Application Initiated'");
        } else {
            System.out.println("Test Failed: Status is not 'Application Initiated'. It is " + statusText);
        }
    }

    public static VerifyCandidateStatus forCandidate(String candidateName){
        return new VerifyCandidateStatus(candidateName);
    }
}
