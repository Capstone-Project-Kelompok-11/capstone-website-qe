package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginWrongPasswordStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the landing page wrong password")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click sign in wrong password")
    public void clickSignIn() {
        loginPage.clickSignInButton();
    }

    @And("I fill email field wrong password")
    public void fillEmailField() {
        loginPage.inputEmail("admin@mail.co");
    }

    @And("I fill password field with wrong password")
    public void fillPasswordField() {
        loginPage.inputPassword("Adminadm!@12234");
    }

    @And("I click login button wrong password")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I see failed login message wrong password")
    public void seeFailedMessage() {
        loginPage.failedLoginMessage();
    }
}
