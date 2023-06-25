package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CoursePage extends PageObject {
    private By allCourse() {
        return By.xpath("//p[@class='text-2xl']");
    }

    private By newCourseButton() {
        return By.xpath("//a[.='New Course']");
    }

    private By threeDotButton() {
        return By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[1]/div[1]/section");
    }

    private By updateCourseButton() {
        return By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > section:nth-child(2) > div:nth-child(2) > button:nth-child(1)");
    }

    private By viewCourseButton() {
        return By.xpath("//a[@href='/course/f2794d678a564a46af0c333dc94eab26']");
    }

    private By viewCourseButton1() {
        return By.xpath("//a[@href='/course/943926f30702493d9d06fdb9afdb57c6']");
    }

    private By courseNameField() {
        return By.id("name");
    }

    private By createDescField() {
        return By.id("description");
    }

    private By coursePriceField() {
        return By.id("price");
    }

    private By levelCourseField() {
        return By.id("level");
    }

    private By levelCourseOpt() {
        return By.xpath("//*[@id=\"level\"]/option[3]");
    }

    private By courseCategoryField() {
        return By.xpath("//select[@name='category']");
    }

    private By courseCategoryOpt() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div[3]/div[3]/div/select/option[4]");
    }

    private By uploadButton() {
        return By.xpath("//button[@class='justify-end ml-auto mr-10 bg-warning-10 hover:bg-warning-30 duration-500 text-black py-2 px-6 rounded-lg text-sm']");
    }

    private By successInfo() {
        return By.xpath("//div[@class='Toastify__toast-body']/div[.='Upload successful!']");
    }

    @Step
    public void validateOnCoursePage() {
        $(allCourse()).isDisplayed();
    }

    @Step
    public void clickNewCourseButton() {
        $(newCourseButton()).click();
    }

    @Step
    public void clickThreeDotButton() {
        $(threeDotButton()).click();
    }

    @Step
    public void clickUpdateButton() {
        $(updateCourseButton()).click();
    }

    @Step
    public void clickViewCourse() {
        $(viewCourseButton()).click();
    }

    @Step
    public void clickViewCourse1() {
        $(viewCourseButton1()).click();
    }

    @Step
    public void inputCourseName(String courseName) {
        $(courseNameField()).type(courseName);
    }

    @Step
    public void inputCourseDesc(String courseDesc) {
        $(createDescField()).type(courseDesc);
    }

    @Step
    public void inputCoursePrice(String coursePrice) {
        $(coursePriceField()).type(coursePrice);
    }

    @Step
    public void clickLevelCourse() {
        $(levelCourseField()).click();
    }

    @Step
    public void chooseLevelCourse() {
        $(levelCourseOpt()).click();
    }

    @Step
    public void clickCategoryCourse() {
        $(courseCategoryField()).click();
    }

    @Step
    public void chooseCategoryCourse() {
        $(courseCategoryOpt()).click();
    }

    @Step
    public void clickUploadButton() {
        $(uploadButton()).click();
    }

    @Step
    public void successSnackbar() {
        $(successInfo()).isDisplayed();
    }
}
