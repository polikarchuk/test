import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPattern {
    public static void execute (String a, String b,String c) {
        open("https://web-quadratic-equation.herokuapp.com/");
        $(By.id(Selectors.PARAM_A)).click();
        $(By.id(Selectors.PARAM_A)).clear();
        $(By.id(Selectors.PARAM_A)).setValue(a);
        $(By.id(Selectors.PARAM_B)).click();
        $(By.id(Selectors.PARAM_B)).clear();
        $(By.id(Selectors.PARAM_B)).setValue(b);
        $(By.id(Selectors.PARAM_C)).click();
        $(By.id(Selectors.PARAM_C)).setValue(c).pressEnter();
        $(By.linkText(Selectors.SEND)).doubleClick();
        $(By.className("alert")).click();

    }
}
