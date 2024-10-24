package com.orangehrmlive.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrmlive.UserInterface.LoginUi.*;



public class Login implements Task {

    private String login,password;

    public Login(String login, String password){

        this.login = login;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(login).into(TXT_INPUT_USERNAME),
                Enter.theValue(password).into(TXT_INPUT_PASSWORD),
                Click.on(BTN_SUBMIT)
        );
    }

    public static Performable on(String login, String password){
        return Instrumented.instanceOf(Login.class).withProperties(login,password);
    }
}
