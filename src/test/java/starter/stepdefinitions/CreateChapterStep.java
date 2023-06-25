package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CoursePage;
import starter.pages.DetailCoursePage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class CreateChapterStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CoursePage coursePage;

    @Steps
    DetailCoursePage detailCoursePage;

    @Given("I am on the login page to create chapter")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to create chapter")
    public void loginToCreateChapter() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("admin@mail.co");
        loginPage.inputPassword("Admin@1234");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to create chapter")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click course to create chapter")
    public void clickCourseToCreateChapter() {
        homePage.clickCourseButton();
        coursePage.validateOnCoursePage();
    }

    @And("I click on view course button")
    public void clickViewCourse() {
        coursePage.clickViewCourse();
    }

    @And("I click + button")
    public void clickPlusButton() {
        detailCoursePage.clickPlusButton();
    }

    @And("I fill the chapter data form")
    public void fillChapterData() {
        detailCoursePage.inputChapterName("Automation 1");
        detailCoursePage.inputChapterDesc("Automation test 1");
    }

    @Then("I click upload to create chapter")
    public void clickUploadToCreateChapter() {
        detailCoursePage.clickUploadButton();
        detailCoursePage.successCreateChapter();
    }
}
