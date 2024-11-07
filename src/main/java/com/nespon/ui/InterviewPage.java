package com.nespon.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterviewPage extends PageObject {
    public static final Target TITLE_INPUT = Target.the("Interview title input").located(By.xpath("//label[text()='Interview Title']/ancestor::div/following-sibling::div/input"));
    public static final Target INTERVIEWER_INPUT = Target.the("Interviewer input").located(By.xpath("//input[@placeholder='Type for hints...']"));
    public static final Target INTERVIEWER_OPTION = Target.the("Interviewer option").located(By.cssSelector(".oxd-autocomplete-option:nth-of-type(1)"));
    public static final Target DATE_INPUT = Target.the("Date input").located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
    public static final Target TIME_INPUT = Target.the("Time input").located(By.xpath("//input[@placeholder='hh:mm']"));
}
