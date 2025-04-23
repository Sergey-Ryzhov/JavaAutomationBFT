package wikipedia.pageElements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Input {
    private final SelenideElement selector;

    public Input(SelenideElement selector) {
        this.selector = selector;
    }

    @Step("Кликаем на строку")
    public Input click() {
        selector.shouldBe(visible, Duration.ofSeconds(30));
        selector.click();
        return this;
    }

    @Step("Вводим данные в поле ввода")
    public Input setValue(String value) {
        selector.click();
        $(selector).shouldBe(visible, Duration.ofSeconds(30));
        selector.sendKeys(value);
        return this;
    }

    @Step("Нажимаем кнопку ENTER")
    public Input pressEnter() {
        selector.shouldBe(visible, Duration.ofSeconds(30));
        selector.pressEnter();
        return this;
    }
}
