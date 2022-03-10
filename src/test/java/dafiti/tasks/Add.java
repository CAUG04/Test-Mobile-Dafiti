package dafiti.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static dafiti.ui.Account.GO_APP;
import static dafiti.ui.ProductList.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Add implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
actor.attemptsTo(
        WaitUntil.the(CATEGORIES, isEnabled()).forNoMoreThan(10).seconds(),
        Check.whether(the(GO_APP), isVisible()).andIfSo(Click.on(GO_APP)),
        Click.on(CATEGORIES),
        Click.on(ACCESSORIES),
        Click.on(PRODUCT),
        Click.on(BTN_BUY),
        Click.on(GOTO_CART)
);
    }
    public static Add theProductWithThe() {
        return Tasks.instrumented(Add.class);
    }
}