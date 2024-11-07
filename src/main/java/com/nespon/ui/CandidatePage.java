package com.nespon.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidatePage extends PageObject {
    public static final Target FIRST_NAME_INPUT = Target.the("First name input").located(By.name("firstName"));
    public static final Target MIDDLE_NAME_INPUT = Target.the("Middle name input").located(By.name("middleName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").located(By.name("lastName"));
    public static final Target VACANCY_DROPDOWN = Target.the("Vacancy dropdown").located(By.xpath("//div[contains(text(),'Select')]"));
    public static final Target VACANCY_WITH_OPTION = Target.the("Vacancy option: {0}").locatedBy("//span[text()='{0}']");
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.xpath("//label[text()='Email']/ancestor::div/following-sibling::div/input"));
    public static final Target PHONE_INPUT = Target.the("Contact number input").located(By.xpath("//label[text()='Contact Number']/ancestor::div/following-sibling::div/input"));
    public static final Target RESUME_INPUT = Target.the("Resume input").located(By.cssSelector(".oxd-file-input"));
    public static final Target KEYWORDS_INPUT = Target.the("Contact number input").located(By.xpath("//label[text()='Keywords']/ancestor::div/following-sibling::div/input"));
    public static final Target NOTES_INPUT = Target.the("Contact number input").located(By.xpath("//label[text()='Notes']/ancestor::div/following-sibling::div/textarea"));
    public static final Target CONSENT_CHECKBOX = Target.the("Resume input").located(By.cssSelector(".oxd-checkbox-input"));
}
