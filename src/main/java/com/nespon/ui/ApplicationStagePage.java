package com.nespon.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationStagePage extends PageObject {
    public static final Target SHORTLIST_BUTTON = Target.the("Add button").located(By.xpath("//button[normalize-space()='Shortlist']"));
    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Add button").located(By.xpath("//button[normalize-space()='Schedule Interview']"));
    public static final Target MARK_PASSED_BUTTON = Target.the("Mark interview passed button").located(By.xpath("//button[normalize-space()='Mark Interview Passed']"));
    public static final Target OFFER_JOB_BUTTON = Target.the("Offer Job button").located(By.xpath("//button[normalize-space()='Offer Job']"));
    public static final Target HIRE_BUTTON = Target.the("Hire button").located(By.xpath("//button[normalize-space()='Hire']"));
    public static final Target HIRING_MANAGER_LABEL = Target.the("Hire button").located(By.xpath("//label[text()='Hiring Manager']/parent::div/following-sibling::div//p"));
}
