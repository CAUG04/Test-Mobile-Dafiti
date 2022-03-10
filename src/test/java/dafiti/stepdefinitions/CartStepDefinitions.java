package dafiti.stepdefinitions;

import dafiti.driver.OwnDriver;
import dafiti.driver.PlayApp;
import dafiti.model.InformationUser;
import dafiti.tasks.Add;
import dafiti.tasks.CreateUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static dafiti.ui.ProductList.NAME_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {actor} open the app Dafiti")
    public void theUserOpenTheAppDafiti(Actor actor) {
        actor.whoCan(PlayApp.with(OwnDriver.initDriver()));
    }

    @When("the user create a new account")
    public void theUserCreateANewAccount(List<InformationUser> informationUser) {
        theActorInTheSpotlight().attemptsTo(CreateUser.theUserCreates(informationUser));
    }

    @And("he adds the product to the cart with")
    public void heAddsTheProductToTheCartWith() {
        theActorInTheSpotlight().attemptsTo(Add.theProductWithThe());
    }

    @Then("he should see the added product in the cart")
    public void heShouldSeeTheAddedProductInTheCart() {
        theActorInTheSpotlight().should(seeThat(the(NAME_PRODUCT)));
    }
}