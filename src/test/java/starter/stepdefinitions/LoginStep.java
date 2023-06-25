package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the landing page")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click sign in")
    public void clickSignIn() {
        loginPage.clickSignInButton();
    }

    @And("I fill email field")
    public void fillEmailField() {
        loginPage.inputEmail("admin@mail.co");
    }

    @And("I fill password field")
    public void fillPasswordField() {
        loginPage.inputPassword("Admin@1234");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the homepage")
    public void onHomepage() {
        homePage.validateOnHomePage();
    }
}
