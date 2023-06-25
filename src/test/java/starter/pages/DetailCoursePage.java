package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailCoursePage extends PageObject {
    private By plusButton() {
        return By.cssSelector("[d='M21.924 16.654h-5.77v5.769a1.154 1.154 0 11-2.307 0v-5.77h-5.77a1.154 1.154 0 110-2.307h5.77v-5.77a1.154 1.154 0 012.308 0v5.77h5.769a1.154 1.154 0 010 2.308z']");
    }

    private By threeDotButton() {
        return By.cssSelector("#headlessui-menu-button-\\:r9\\: > svg");
    }

    private By quizButton() {
        return By.xpath("//*[@id=\"headlessui-menu-item-:rc:\"]");
    }

    private By chapterNameField() {
        return By.id("name");
    }

    private By chapterDescField() {
        return By.id("description");
    }

    private By uploadChapterButton() {
        return By.xpath("//button[@class='justify-end ml-auto mr-8 bg-warning-10 hover:bg-warning-30 text-black py-2 px-6 rounded-lg text-sm']");
    }

    private By snackbarCreateChapter() {
        return By.xpath("//div[@class='Toastify__toast-body']/div[.='Successfully created new module!']");
    }

    @Step
    public void clickPlusButton() {
        $(plusButton()).click();
    }

    @Step
    public void clickThreeDot() {
        $(threeDotButton()).click();
    }

    @Step
    public void clickQuizButton() {
        $(quizButton()).click();
    }

    @Step
    public void inputChapterName(String courseName) {
        $(chapterNameField()).type(courseName);
    }

    @Step
    public void inputChapterDesc(String courseDesc) {
        $(chapterDescField()).type(courseDesc);
    }

    @Step
    public void clickUploadButton() {
        $(uploadChapterButton()).click();
    }

    @Step
    public void successCreateChapter() {
        $(snackbarCreateChapter()).waitUntilPresent();
    }
}
