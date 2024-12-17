package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason {string}")
    public void iSelectReason() {
        new ReasonForTravelPage().selectReasonForVisit();
    }

    @Then("I should see the result message {string}")
    public void iShouldSeeTheResultMessage(String expectedMessage) {
        new ResultPage().confirmResultMessage(expectedMessage);
    }
    //scenario 2 Chilean coming for work

    @And("I select length of stay {string}")
    public void iSelectLengthOfStay(String length) {
        new DurationOfStayPage().selectLengthOfStay(length);
        new DurationOfStayPage().clickNextStepButton();
    }

    @When("I select planning to work for{string}")
    public void iSelectPlanningToWorkFor(String job){
        new WorkTypePage().selectJobType();
        new WorkTypePage().clickNextStepButton();
    }

//    // Scenario 3: Verify countries in the dropdown
//    @Then("I can see the following countries in the dropdown")
//    public void i_can_see_the_following_countries_in_the_dropdown(io.cucumber.datatable.DataTable countries) {
//        for (String country : countries.asList()) {
//            Assert.assertTrue("Country " + country + " is not in the dropdown", SelectNationalityPage.nationalityDropDownList());
//        }
//    }
}
