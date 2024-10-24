package com.orangehrmlive.UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUi {

    public static final Target TXT_INPUT_USERNAME = Target.the("username input")
            .locatedBy("//input[@name='username']");

    public static final Target TXT_INPUT_PASSWORD = Target.the("password input")
            .locatedBy("//input[@name='password' and @type='password']");

    public static final Target BTN_SUBMIT = Target.the("btn submit")
            .locatedBy("//button[@type='submit']");
}
