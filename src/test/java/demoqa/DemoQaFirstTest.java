package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoQaFirstTest {
    @Test
    void firstDemoTest () {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Anton");
        $("#lastName").setValue("Korzov");
        $("#userEmail").setValue("Korzov@qa.com");
        $x("//label[text()='Male']").click();
        $("#userNumber").setValue("89994859885");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(byText("January")).click();
        $(".react-datepicker__year-select").$(byText("1992")).click();
        $(".react-datepicker__day--018").click();
        $("#subjectsInput").setValue("History").click();
        $(".subjects-auto-complete__menu").click();
        $x("//label[text()='Reading']").click();
        $("#uploadPicture").uploadFile(new File("src\\test\\resources\\fallout.jpg"));
        $("#currentAddress").setValue("Moscow");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();
        $(".modal-content").shouldBe(visible);
        $(".table-responsive").shouldHave(
                text("Anton Korzov"),
                text("Korzov@qa.com"),
                text("Male"),
                text("8999485988"),
                text("18 January,1992"),
                text("History"),
                text("Reading"),
                text("fallout.jpg"),
                text("Moscow"),
                text("Haryana Karnal")
        );
    }
}
