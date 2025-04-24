package wikipedia.pageObject;

import io.qameta.allure.Step;
import wikipedia.pageElements.Input;
import wikipedia.pageElements.TextField;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainWikiPage {
    private final Input searchInput = new Input($("#searchInput"));
    private final Input secondarySearchInput = new Input($x("(//input[@placeholder='Искать в Википедии'])[2]"));
    private final TextField primarySearchField = new TextField($x("//span[text()='Спартак']"));
    private final TextField wikiLogo = new TextField($x("//div[@class='branding-box']//img[1]"));

    @Step("Открываем страницу Википедии")
    public MainWikiPage go() {
        open("https://ru.m.wikipedia.org");
        return this;
    }
    @Step("Кликаем на поле поиска")
    public MainWikiPage clickField() {
        searchInput.click();
        return this;
    }
    @Step("Вводим значение в поиске")
    public MainWikiPage setValue(String value) {
        secondarySearchInput.setValue(value);
        secondarySearchInput.pressEnter();
        return this;
    }
    @Step("Проверяем результат поиска страницы")
    public MainWikiPage textCheck() {
        assertEquals(primarySearchField.textCheck(), "Спартак", "Не та страница");
        return this;
    }
    @Step("Проверяем лого страницы")
    public MainWikiPage textLogoCheck() {
        assertEquals(wikiLogo.textLogoCheck(), "Википедия", "Не то лого");
        return this;
    }
}
