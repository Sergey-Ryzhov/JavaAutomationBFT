package wikipedia.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wikipedia.pageObject.MainWikiPage;
import wikipedia.settings.BaseTest;


import static com.codeborne.selenide.Selenide.*;

public class WikiTest extends BaseTest {
    MainWikiPage mainWikiPage = new MainWikiPage();

    @DisplayName("Тест на открытие Википедии и проверка лого")
    @Test
    public void searchOnWikipedia() {
        mainWikiPage.go()
                .clickField()
                .setValue("Спартак")
                .textCheck()
                .textLogoCheck();
        sleep(5000);
    }
}