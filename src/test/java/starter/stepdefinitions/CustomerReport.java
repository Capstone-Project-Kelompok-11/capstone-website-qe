package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CoursePage;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.ReportingPage;

public class CustomerReport {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    ReportingPage reportingPage;

    @Given("I am on the login page to see report")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to see report")
    public void loginToCreateCourse() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("admin@mail.co");
        loginPage.inputPassword("Admin@1234");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to see report")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click reporting tab")
    public void clickReporting() {
        homePage.clickReportingButton();
    }

    @And("I click on course")
    public void clickOnCourse() {
        reportingPage.clickCourse1();
    }

    @And("I click on customer")
    public void clickOnCustomer() {
        reportingPage.clickUser1();
    }

    @Then("I see customer report")
    public void seeCustomerReport() {
        reportingPage.validateUserReport();
    }
}
