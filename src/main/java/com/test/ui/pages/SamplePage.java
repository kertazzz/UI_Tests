package com.test.ui.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import lombok.Getter;
import lombok.Value;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class SamplePage {
    private final SelenideElement pageHeader = $(".page_heading");
    private final SelenideElement fileUploader = $("[type=file]");
    private final SelenideElement nameInput = $("input.name");
    private final SelenideElement emailInput = $("input.email");
    private final SelenideElement websiteInput = $("input.url");
    private final SelenideElement experienceOptions = $("select.select");
    private final SelenideElement expertiseCheckbox = $(".grunion-field-checkbox-multiple-wrap");
    private final SelenideElement educationRadio = $("input[type=radio]");
    private final SelenideElement alertButton = $("button[onclick]");
    private final SelenideElement commentInput = $("textarea.textarea");
    private final SelenideElement submitButton = $("button[type='submit']");
    private final SelenideElement contactForm = $(".contact-form-submission");
    private final ElementsCollection contactFormResult = $$(".contact-form-submission p");
}
