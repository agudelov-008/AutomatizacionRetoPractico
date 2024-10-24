package com.orangehrmlive.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\Recruitment.feature",
        glue = "com.orangehrmlive.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RecruitmentRunner {
}
