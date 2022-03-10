package dafiti.tasks;

import dafiti.model.InformationUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static dafiti.ui.Account.*;
import static dafiti.ui.ProductList.CATEGORIES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CreateUser implements Task {

    private InformationUser informationUser;

    public CreateUser(List<InformationUser> informationUser) {
        this.informationUser = informationUser.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Check.whether(the(GO_APP), isVisible()).andIfSo(Click.on(GO_APP)),
                Click.on(SECTION_MEN),
                Click.on(ACCOUNT),
                Click.on(GET_IN),
                Click.on(CREATE_ACCOUNT),
                Enter.theValue(informationUser.getEmail()).into(EMAIL),
                Enter.theValue(informationUser.getPassword()).into(PASSWORD),
                Enter.theValue(informationUser.getPassword()).into(CONFIRMATE_PASSWORD),
                Click.on(DOCUMENT_TYPE),
                Click.on(SELECT_DOCUMENT_TYPE),
                Enter.theValue(informationUser.getId()).into(ID),
                Enter.theValue(informationUser.getName()).into(FIRST_NAME),
                Enter.theValue(informationUser.getLastName()).into(LAST_NAME),
                Enter.theValue(informationUser.getBirtDate()).into(BIRTDATE),
                Click.on(GENDER),
                Click.on(SELECT_GENDER),
                Click.on(SAVE_DATA)

        );
    }
    public static CreateUser theUserCreates(List<InformationUser> informationUser) {
        return new CreateUser(informationUser);
    }
}