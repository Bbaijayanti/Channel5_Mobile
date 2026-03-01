package com.my5.mobile.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import io.appium.java_client.ios.IOSDriver;

public class LoginPage {

    private IOSDriver driver = null;

    private final By emailField = AppiumBy.accessibilityId("email");
    private final By passwordField = AppiumBy.accessibilityId("password");
    private final By loginButton = AppiumBy.accessibilityId("login");

    public LoginPage() {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void tapLogin() {
        driver.findElement(loginButton).click();
    }

    public void clickLogin() {
    }
}