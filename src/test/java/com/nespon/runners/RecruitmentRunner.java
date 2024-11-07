package com.nespon.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/recruitment.feature",
        glue = "com.nespon.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class RecruitmentRunner {
}

