package com.nespon.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {
    public static final Target ADD_BUTTON = Target.the("Add button").located(By.xpath("//button[normalize-space()='Add']"));
    public static final Target SAVE_BUTTON = Target.the("Save button").located(By.xpath("//button[normalize-space()='Save']"));
    public static final Target CANDIDATE_ROW = Target.the("Row by input value").locatedBy("//div[@role='row']");
    public static final Target INPUT_IN_ROW = Target.the("Input in row").locatedBy(".//div[@role='cell' and .//span[contains(@class,'oxd-checkbox-input')]]");
    public static final Target CELL_WITH_TEXT = Target.the("Cell with text").locatedBy(".//div[@role='cell' and contains(.,'{0}')]");
}
