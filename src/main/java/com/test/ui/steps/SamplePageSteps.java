package com.test.ui.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ModalOptions;
import com.codeborne.selenide.Selenide;
import com.test.ui.pages.SamplePage;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.confirm;


@RequiredArgsConstructor
public class SamplePageSteps {

    private final SamplePage samplePage = new SamplePage();


    @Step("Открываем страницу и проверяем её на соответствие")
    public SamplePageSteps openPage() {
        Selenide.open("/");
        samplePage.getPageHeader().shouldBe(Condition.appear).shouldHave(Condition.exactText("Sample Page Test"));
        return this;
    }
    @Step("Загружаем файл-изображение")
    public SamplePageSteps uploadFile(String classpath) {
        samplePage.getFileUploader().uploadFromClasspath(classpath);
        return this;
    }
    @Step("Заполняем поля имени {0}")
    public SamplePageSteps setName (String name) {
        samplePage.getNameInput().setValue(name);
        return this;
    }
    @Step("Заполняем поле email {0}")
    public SamplePageSteps setEmail (String email) {
        samplePage.getEmailInput().setValue(email);
        return this;
    }
    @Step("Заполняем поле website {0}")
    public SamplePageSteps setWebsite (String website) {
        if (website.isBlank()) return this;
        samplePage.getWebsiteInput().setValue(website);
        return this;
    }
    @Step("Выбираем опции выпадающего списка experience years {0}")
    public SamplePageSteps setExperience(String years) {
        if (years.isBlank()) return this;
        samplePage.getExperienceOptions().selectOption(years);
        return this;
    }
    @Step("Выбираем значения в чек-боксе experience")
    public SamplePageSteps setExpertiseCheckbox (List<String> expertiseList) {
        if (expertiseList.contains("-")) return this;
        for (String expert : expertiseList) {
            samplePage.getExpertiseCheckbox().$("[value='" + expert + "']").click();
        }
        return this;
    }
    @Step("Выбираем опцию в radio education {0} ")
    public SamplePageSteps setEducationRadio (String education) {
        if (education.equals("-")) return this;
        samplePage.getEducationRadio().selectRadio(education).click();
        return this;
    }
    @Step("Кликаем по кнопке Alert и принимаем уведомление")
    public SamplePageSteps clickAlertButton() {
        samplePage.getAlertButton().click();
        confirm(new ModalOptions("Do you really fill rest of the form?", Duration.ofSeconds(3)));
        confirm(new ModalOptions("Good Luck. Go for it", Duration.ofSeconds(3)));
        return this;
    }
    @Step("Заполняем поле comment")
    public SamplePageSteps setComment(String comment) {
        samplePage.getCommentInput().setValue(comment);
        return this;
    }
    @Step("Кликаем на отправку формы")
    public SamplePageSteps submit() {
        samplePage.getSubmitButton().click();
        return this;
    }
    @Step("Проверяем появление заполненной формы")
    public SamplePageSteps checkFormResultExistence() {
         samplePage.getContactForm().should(Condition.exist);
         return this;
    }
    @Step("Проверяем отсутствие заполненной формы")
    public SamplePageSteps checkFormResultAbsence() {
        samplePage.getContactForm().should(Condition.not(Condition.exist));
        return this;
    }

    @Step("Проверяем корректность данных в заполненной форме")
    public void checkFormWithCorrectData (String name, String email, String website, String exp, String expertiseList, String edu, String com) {
        samplePage.getContactFormResult().shouldHave(CollectionCondition.texts(
                "Name: " + name,
                "Email: " + email,
                "Website: " + website,
                "Experience (In Years): " + exp,
                "Expertise :: " + expertiseList.replaceAll("-", "").replaceAll(";", ","),
                "Education: " + edu.replaceAll("-", ""),
                "Comment: " + com
        ));


    }

}
