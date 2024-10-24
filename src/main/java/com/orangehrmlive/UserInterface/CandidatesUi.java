package com.orangehrmlive.UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CandidatesUi {

    public static final Target BTN_SHORTLIST = Target.the("Shortlist btn")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--success' and contains(normalize-space(), 'Shortlist')]");

    public static final Target LABEL_NAME = Target.the("label name")
            .locatedBy("(//p[@class='oxd-text oxd-text--p'])[1]");
}
