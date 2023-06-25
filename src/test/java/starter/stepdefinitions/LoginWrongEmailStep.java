package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginWrongEmailStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the landing page wrong email")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click sign in wrong email")
    public void clickSignIn() {
        loginPage.clickSignInButton();
    }

    @And("I fill email field with wrong email")
    public void fillEmailField() {
        loginPage.inputEmail("admin123@email.com");
    }

    @And("I fill password field wrong email")
    public void fillPasswordField() {
        loginPage.inputPassword("Admin@1234");
    }

    @And("I click login button wrong email")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I see failed login message wrong email")
    public void seeFailedMessage() {
        loginPage.failedLoginMessage();
    }
}
