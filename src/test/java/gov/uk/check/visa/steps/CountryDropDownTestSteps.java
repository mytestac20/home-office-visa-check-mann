package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class CountryDropDownTestSteps {
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

//    @Then("I can see the following countries in the dropdown:")
//    public void iCanSeeTheFollowingCountriesInTheDropdown(List<String> expectedCountries) {
//        for (String country : expectedCountries) {
//            boolean isCountryPresent = na.isCountryInDropdown(country);
//            Assert.assertTrue("Country " + country + " is not found in the dropdown.", isCountryPresent);
//        }
//    }
}
