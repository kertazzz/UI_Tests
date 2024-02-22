package com.test.ui.samplePage;

import com.test.BaseTestUi;
import com.test.ui.steps.SamplePageSteps;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class TestCase3 extends BaseTestUi {

    @Test
    @Epic("ui")
    @Feature("Sample page input form")
    @Story("Empty required name field ")
    public void testCaseWithoutName() {
        new SamplePageSteps().openPage().setName("").setEmail("andrew@yahoo.com").setComment("some random text").submit().checkFormResultAbsence();
    }

    @Test
    @Epic("ui")
    @Feature("Sample page input form")
    @Story("Empty required email field ")
    public void testCaseWithoutEmail() {
        new SamplePageSteps().openPage().setName("Andrew").setEmail("").setComment("some random text").submit().checkFormResultAbsence();
    }

    @Test
    @Epic("ui")
    @Feature("Sample page input form")
    @Story("Empty required comment field ")
    public void testCaseWithoutComment() {
        new SamplePageSteps().openPage().setName("Andrew").setEmail("andrew@yahoo.com").setComment("").submit().checkFormResultAbsence();
    }
}
