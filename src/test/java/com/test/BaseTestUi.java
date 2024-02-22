package com.test;


import com.codeborne.selenide.logevents.SelenideLogger;
import com.test.config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestUi {

    @BeforeAll
    public static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebDriverProvider.config();
    }
}
