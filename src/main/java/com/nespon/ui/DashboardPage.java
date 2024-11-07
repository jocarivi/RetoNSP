package com.nespon.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    public static final Target RECRUITMENT_TAB = Target.the("Recruitment tab").located(By.xpath("//li//span[normalize-space()='Recruitment']"));
}
