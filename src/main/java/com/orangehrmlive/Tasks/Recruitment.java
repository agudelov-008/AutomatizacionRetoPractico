package com.orangehrmlive.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrmlive.UserInterface.RecruitmentUi.*;

public class Recruitment implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD)
        );
    }

    public static Performable on (){
        return Instrumented.instanceOf(Recruitment.class).withProperties();
    }
}
