package com.test.ui.samplePage;

import com.test.BaseTestUi;
import com.test.ui.steps.SamplePageSteps;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.Arrays;



public class TestCase1 extends BaseTestUi {


    @ParameterizedTest
    @CsvFileSource(resources = "/csv/testdataPICT3.csv")
    @Epic("ui")
    @Feature("Sample page input form")
    @Story("User-case scenario using Pairwise Independent Combinatorial Testing")
    public void testCase(String name, String email, String website, String exp, String expertiseList, String edu, String com) {
        new SamplePageSteps().openPage()
                .uploadFile("img/Angron500.jpg")
                .setName(name)
                .setEmail(email)
                .setWebsite(website)
                .setExperience(exp)
                .setExpertiseCheckbox(Arrays.stream(expertiseList.split("; ")).toList())
                .setEducationRadio(edu)
                .clickAlertButton()
                .setComment(com)
                .submit()
                .checkFormResultExistence()
                .checkFormWithCorrectData(name, email, website, exp, expertiseList, edu, com);

    }
}
