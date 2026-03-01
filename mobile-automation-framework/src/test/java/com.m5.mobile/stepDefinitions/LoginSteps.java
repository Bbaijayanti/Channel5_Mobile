package com.my5.mobile.stepdefinitions;

import com.my5.mobile.pages.LoginPage;
import com.my5.mobile.pages.HomePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is on login screen")
    public void userOnLoginScreen() {}

    @When("User enters valid credentials")
    public void enterCredentials() {
        loginPage.enterEmail("test@gmail.com");
        loginPage.enterPassword("Password123");
    }

    @And("User taps login")
    public void tapLogin() {
        loginPage.clickLogin();
    }

    @Then("Home screen should be displayed")
    public void verifyHome() {
        Assert.assertTrue(homePage.isDisplayed());
    }
}