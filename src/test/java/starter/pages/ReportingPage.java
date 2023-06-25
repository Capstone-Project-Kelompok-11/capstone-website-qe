package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReportingPage extends PageObject {
    private By title() {
        return By.xpath("//*[@id=\"root\"]/div[1]/section/h1");
    }

    private By course1() {
        return By.xpath("//*[@id=\"root\"]/div[1]/section/section/a[3]/div");
    }

    private By user1() {
        return By.xpath("//*[@id=\"root\"]/div[1]/div/a[4]/div");
    }

    private By summary() {
        return By.xpath("//h2[@class='font-bold text-3xl']");
    }

    @Step
    public void validateReportingTab() {
        $(title()).isDisplayed();
    }

    @Step
    public void clickCourse1() {
        $(course1()).click();
    }

    @Step
    public void clickUser1() {
        $(user1()).click();
    }

    @Step
    public void validateUserReport() {
        $(summary()).isDisplayed();
    }
}
