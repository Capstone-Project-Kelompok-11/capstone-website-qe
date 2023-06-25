package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class QuizPage extends PageObject {
    private By plusButton() {
        return By.cssSelector("#root > div.relative.pl-80.my-6 > form > div > div:nth-child(3) > section > div > div > div > div.flex.flex-col.border-l-2.border-secondary-10.gap-4.px-4.py-8.w-1\\/6 > button:nth-child(2) > svg");
    }

    private By soalField1() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[1]/input");
    }

    private By jawabanField11() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/input[2]");
    }

    private By buttonJawaban11() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/input[1]");
    }

    private By jawabanField12() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/input[2]");
    }

    private By buttonJawaban12() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/input[1]");
    }

    private By jawabanField13() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[3]/input[2]");
    }

    private By buttonJawaban13() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[3]/input[1]");
    }

    private By jawabanField14() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[4]/input[2]");
    }

    private By buttonJawaban14() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[4]/input[1]");
    }

    private By soalField2() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[1]/input");
    }

    private By jawabanField21() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[1]/input[2]");
    }

    private By buttonJawaban21() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[1]/input[1]");
    }

    private By jawabanField22() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[2]/input[2]");
    }

    private By buttonJawaban22() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[2]/input[1]");
    }

    private By jawabanField23() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[3]/input[2]");
    }

    private By buttonJawaban23() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[3]/input[1]");
    }

    private By jawabanField24() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[4]/input[2]");
    }

    private By buttonJawaban24() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/section/div/div/div[2]/div[1]/div/div[2]/div[4]/input[1]");
    }

    private By submitButton() {
        return By.xpath("//*[@id=\"root\"]/div[1]/form/div/div[2]/div/button");
    }

    private By successSnackbar() {
        return By.xpath("//div[@class='Toastify__toast-body']/div[.='Create quiz success']");
    }

    @Step
    public void inputSoal1(String soal1) {
        $(soalField1()).type(soal1);
    }

    @Step
    public void inputJawaban11(String jawaban11) {
        $(jawabanField11()).type(jawaban11);
    }

    @Step
    public void clickJawaban11() {
        $(buttonJawaban11()).click();
    }

    @Step
    public void inputJawaban12(String jawaban12) {
        $(jawabanField12()).type(jawaban12);
    }

    @Step
    public void clickJawaban12() {
        $(buttonJawaban12()).click();
    }

    @Step
    public void inputJawaban13(String jawaban13) {
        $(jawabanField13()).type(jawaban13);
    }

    @Step
    public void clickJawaban13() {
        $(buttonJawaban13()).click();
    }

    @Step
    public void inputJawaban14(String jawaban14) {
        $(jawabanField14()).type(jawaban14);
    }

    @Step
    public void clickJawaban14() {
        $(buttonJawaban14()).click();
    }

    @Step
    public void inputSoal2(String soal2) {
        $(soalField2()).type(soal2);
    }

    @Step
    public void inputJawaban21(String jawaban21) {
        $(jawabanField21()).type(jawaban21);
    }

    @Step
    public void clickJawaban21() {
        $(buttonJawaban21()).click();
    }

    @Step
    public void inputJawaban22(String jawaban22) {
        $(jawabanField22()).type(jawaban22);
    }

    @Step
    public void clickJawaban22() {
        $(buttonJawaban22()).click();
    }

    @Step
    public void inputJawaban23(String jawaban23) {
        $(jawabanField23()).type(jawaban23);
    }

    @Step
    public void clickJawaban23() {
        $(buttonJawaban23()).click();
    }

    @Step
    public void inputJawaban24(String jawaban24) {
        $(jawabanField24()).type(jawaban24);
    }

    @Step
    public void clickJawaban24() {
        $(buttonJawaban24()).click();
    }

    @Step
    public void clickPlusButton() {
        $(plusButton()).click();
    }

    @Step
    public void clickSubmitButton() {
        $(submitButton()).click();
    }

    @Step
    public void successMessage() {
        $(successSnackbar()).waitUntilPresent();
    }
}