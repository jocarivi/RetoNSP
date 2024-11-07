package com.nespon.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("Username input").located(By.name("username"));
    public static final Target PASSWORD_INPUT = Target.the("Password input").located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.xpath("//button[normalize-space()='Login']"));
}

