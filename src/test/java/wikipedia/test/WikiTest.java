package wikipedia.test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wikipedia.settings.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class WikiTest extends BaseTest {
    @DisplayName("Тест на открытие Википедии и проверка лого")
    @Test
    public void searchOnWikipedia() {
        Selenide.open("https://ru.m.wikipedia.org");
        $("#searchInput").click();
        $x("(//input[@name='search'])[2]").setValue("Спартак").pressEnter();
        Assertions.assertEquals
                ($x("//span[text()='Спартак']")
                        .text(),"Спартак","Не та страница");
        Assertions.assertEquals
                ($x("//img[@alt='Википедия']")
                        .getAttribute("alt"), "Википедия", "Не то лого");
        sleep(5000);
    }
}