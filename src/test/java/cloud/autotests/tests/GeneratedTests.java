package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка поисковой строки")
    void searchTest() {

        step("Открываем сайт github", () -> {
            open("https://github.com/");
        });

        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $("#user_email").setValue("23123").pressEnter();
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка перехода на страницу Team")
    void checkTest() {
        step("Открываем сайт 'https://github.com/'", () -> {
            open("https://github.com/");
        });
        step("Перейти в раздел Team", () -> {
            $("[href=\"/team\"]").click();
        });
        step("Проверяем отображение текста", () -> {
            $(".container-lg").shouldBe(visible).shouldHave(text("Build like the best teams on the planet"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка отображения ошибки, если ввели неверный email")
    void searchValidationInnTest() {
        step("Открываем сайт 'https://github.com/'", () -> {
            open("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        });
        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $("#email").setValue("eee").click();
        });
        step("Проверяем отображение текста", () -> {
            $("#email-err").shouldBe(visible).shouldHave(text("Email is invalid or already taken"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка раздел integrations")
    void menuСheckTest() {
        step("Открываем сайт 'https://github.com/'", () -> {
            open("https://github.com/");
        });
        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $(".HeaderMenu-summary").hover();
        });
        step("Проверяем отображение страницы поиска", () -> {
            $(".HeaderMenu-details").shouldHave(text("integrations")).click();
        });
    }

}