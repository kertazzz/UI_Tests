package com.test.ui.samplePage;

import com.test.BaseTestUi;
import com.test.ui.steps.SamplePageSteps;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class TestCase2 extends BaseTestUi {

    @Test
    @Epic("ui")
    @Feature("Sample page input form")
    @Story("Only required fields scenario")
    public void testCase() {
        new SamplePageSteps().openPage()
                .setName("Andrew")
                .setEmail("andrew@yahoo.com")
                .setComment("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.")
                .submit()
                .checkFormResultExistence()
                .checkFormWithCorrectData("Andrew", "andrew@yahoo.com","","0-1","","", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

    }
}
