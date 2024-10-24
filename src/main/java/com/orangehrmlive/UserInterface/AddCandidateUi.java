package com.orangehrmlive.UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddCandidateUi {

    public static final Target INPUT_FIRSTNAME = Target.the("first name")
            .locatedBy("//input[@name='firstName']");

    public static final Target INPUT_MIDDLENAME = Target.the("middle name")
            .locatedBy("//input[@name='middleName']");

    public static final Target INPUT_LASTNAME = Target.the("last name")
            .locatedBy("//input[@name='lastName']");

    public static final Target DROP_VACANCY = Target.the("Vcancy dropdown")
            .locatedBy("//div[@class='oxd-select-text oxd-select-text--active']");

    public static final Target OP_VACANCY = Target.the("Vancy option")
            .locatedBy("//div[@class='oxd-select-option' and contains(normalize-space(), 'Senior QA Lead')]");

    public static final Target INPUT_EMAIL = Target.the("Email input")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");

    public static final Target INPUT_CONTACT_NUMBER = Target.the("Contact number")
            .locatedBy("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");

    public static final Target INPUT_BROWSE_FILE = Target.the("file browser input")
            .locatedBy("//input[@class='oxd-file-input' and @type='file']");

    public static final Target INPUT_KEYWORDS = Target.the("Keyword input")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input");

    public static Target INPUT_TEXT_AREA = Target.the("Text area for notes")
            .locatedBy("//div//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");

    public static Target CHEKCBOX_CONSENT = Target.the("Consent to keep data checkbox")
            .locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");

    public static Target INPUT_DATE = Target.the("Date input")
            .locatedBy("//div[@class='oxd-date-input']");

    public static Target BTN_SAVE = Target.the("Save button")
            .locatedBy("//button[contains(normalize-space(), 'Save')]");

}
