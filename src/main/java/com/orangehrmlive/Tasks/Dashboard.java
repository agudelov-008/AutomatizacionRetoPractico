package com.orangehrmlive.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrmlive.UserInterface.DashboardUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Dashboard implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(I_HAMBURGUER.resolveFor(actor).isDisplayed())
                        .andIfSo(Click.on(I_HAMBURGUER),
                                WaitUntil.the(SPAN_RECRUITMENT, isVisible() )
                                        .forNoMoreThan(5).seconds())
                        .otherwise(
                                Click.on(SPAN_RECRUITMENT))
        );
    }

    public static Performable on (){
        return Instrumented.instanceOf(Dashboard.class).withProperties();
    }
}
