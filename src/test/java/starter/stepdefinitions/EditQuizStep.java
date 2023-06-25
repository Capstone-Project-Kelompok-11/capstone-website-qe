package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.*;

public class EditQuizStep {
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

    @Given("I am on the login page to edit quiz")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to edit quiz")
    public void loginToCreateQuiz() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("admin@mail.co");
        loginPage.inputPassword("Admin@1234");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to edit quiz")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click course to edit quiz")
    public void clickCourseToCreateQuiz() {
        homePage.clickCourseButton();
        coursePage.validateOnCoursePage();
    }

    @And("I click on view course button to edit quiz")
    public void clickViewCourse() {
        coursePage.clickViewCourse();
    }

    @And("I click on quiz button to edit quiz")
    public void clickPlusButton() {
        detailCoursePage.clickThreeDot();
        detailCoursePage.clickQuizButton();
    }

    @And("I edit the quiz soal and jawaban")
    public void fillQuizData() {
        quizPage.clickPlusButton();
        quizPage.inputSoal2("Apakah benar?");
        quizPage.inputJawaban21("Ya");
        quizPage.inputJawaban22("Tidak");
        quizPage.inputJawaban23("Mungkin");
        quizPage.inputJawaban24("Tidak tahu");
        quizPage.clickJawaban23();
    }

    @Then("I click update to edit quiz")
    public void clickUploadToCreateChapter() {
        quizPage.clickSubmitButton();
    }
}
