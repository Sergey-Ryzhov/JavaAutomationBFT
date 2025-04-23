package wikipedia.pageElements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;

public class TextField {
    private final SelenideElement selector;

    public TextField(SelenideElement selector) {
        this.selector = selector;
    }

    @Step("Получаем значение текстового поля")
    public String textCheck() {
        selector.shouldBe(enabled, Duration.ofSeconds(30));
        return selector.getText();
    }

    @Step("Получаем значение текста лого")
    public String textLogoCheck() {
        selector.shouldBe(enabled, Duration.ofSeconds(30));
        return selector.getAttribute("alt");
    }

}
