package com.orangehrmlive.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.nio.file.Path;
import java.nio.file.Paths;


import static com.orangehrmlive.UserInterface.AddCandidateUi.*;

public class AddCandidate implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        Path filePath = Paths.get("TestFile.txt");

        actor.attemptsTo(

                Enter.theValue("Juan").into(INPUT_FIRSTNAME),
                Enter.theValue("Camilo").into(INPUT_MIDDLENAME),
                Enter.theValue("Agudelo").into(INPUT_LASTNAME),
                Click.on(DROP_VACANCY),
                Click.on(OP_VACANCY),
                Enter.theValue("Tester110801@gmail.com").into(INPUT_EMAIL),
                Enter.theValue("3241234567").into(INPUT_CONTACT_NUMBER),
                Upload.theFile(filePath).to(INPUT_BROWSE_FILE),
                Enter.theValue("QA, LEAD, ENGINEER").into(INPUT_KEYWORDS),
                Enter.theValue("The few absolute xpaths that were used were used due to lack of time (Work and Study).")
                        .into(INPUT_TEXT_AREA),
                Click.on(INPUT_DATE),
                Click.on(CHEKCBOX_CONSENT)

        );
    }

    public  static Performable on (){
        return new AddCandidate();
    }
}
