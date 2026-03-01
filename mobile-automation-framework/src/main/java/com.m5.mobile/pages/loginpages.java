package com.my5.mobile.pages;

public class LoginPage {

    IOSDriver driver;

    By emailField = MobileBy.AccessibilityId("email_input");
    By passwordField = MobileBy.AccessibilityId("password_input");
    By loginButton = MobileBy.AccessibilityId("login_button");

    public LoginPage(IOSDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}