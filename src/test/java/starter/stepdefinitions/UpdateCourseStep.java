package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CoursePage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class UpdateCourseStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CoursePage coursePage;

    @Given("I am on the login page to update course")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to update course")
    public void loginToCreateCourse() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("admin@mail.co");
        loginPage.inputPassword("Admin@1234");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to update course")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click course to update course")
    public void clickCourseToUpdate() {
        homePage.clickCourseButton();
        coursePage.validateOnCoursePage();
    }

    @And("I click on three dot on the course")
    public void clickThreeDot() {
        coursePage.clickThreeDotButton();
    }

    @And("I click update to update course")
    public void clickUpdateCourse() {
        coursePage.clickUpdateButton();
    }

    @And("I change the course data form")
    public void fillCourseData() {
        coursePage.inputCourseDesc("update course 1");
        coursePage.inputCoursePrice("1500000");
    }

    @Then("I click update")
    public void clickUploadToUpdate() {
        coursePage.clickUploadButton();
        coursePage.successSnackbar();
    }
}
