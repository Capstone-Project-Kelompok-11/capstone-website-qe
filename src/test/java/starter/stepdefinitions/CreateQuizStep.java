package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.*;

public class CreateQuizStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CoursePage coursePage;

    @Steps
    DetailCoursePage detailCoursePage;

    @Steps
    QuizPage quizPage;

    @Given("I am on the login page to create quiz")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to create quiz")
    public void loginToCreateQuiz() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("admin@mail.co");
        loginPage.inputPassword("Admin@1234");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to create quiz")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click course to create quiz")
    public void clickCourseToCreateQuiz() {
        homePage.clickCourseButton();
        coursePage.validateOnCoursePage();
    }

    @And("I click on view course button to create quiz")
    public void clickViewCourse() {
        coursePage.clickViewCourse();
    }

    @And("I click on quiz button")
    public void clickPlusButton() {
        detailCoursePage.clickThreeDot();
        detailCoursePage.clickQuizButton();
    }

    @And("I fill the quiz soal and jawaban")
    public void fillQuizData() {
        quizPage.inputSoal1("Apakah benar?");
        quizPage.inputJawaban11("Ya");
        quizPage.inputJawaban12("Tidak");
        quizPage.inputJawaban13("Mungkin");
        quizPage.inputJawaban14("Tidak tahu");
        quizPage.clickJawaban11();
    }

    @Then("I click submit")
    public void clickUploadToCreateChapter() {
        quizPage.clickSubmitButton();
    }
}