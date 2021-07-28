package co.com.choucair.certification.EmpleosChoucair.stepdefinitions;

import co.com.choucair.certification.EmpleosChoucair.tasks.Jobs;
import co.com.choucair.certification.EmpleosChoucair.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EmpleosChoucairStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Cindy wants to register on the Choucair job portal$")
    public void cindyWantsToRegisterOnTheChoucairJobPortal() {
        OnStage.theActorCalled("Cindy").wasAbleTo(OpenUp.thePage());
        OnStage.theActorCalled("Cindy").wasAbleTo(Jobs.onThePage());

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @When("^She looks for the button to go to the job portal in the upper center of the page$")
    public void sheLooksForTheButtonToGoToTheJobPortalInTheUpperCenterOfThePage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^She the button and is registered in the portal$")
    public void sheTheButtonAndIsRegisteredInThePortal() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
