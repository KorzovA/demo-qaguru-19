package Korzov;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterprizeTest {
    @Test
    void solutionsHeaderCheck() {
        open("https://github.com/");
        $(".Header-old").$(byText("Solutions")).click();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".application-main ").shouldHave(text("Build like the best"));
    }
}
