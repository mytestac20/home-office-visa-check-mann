package gov.uk.check.visa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage {

    @CacheLookup
    @FindBy (xpath = "//input[@id='response-1']")//(id = "length-of-stay")
    WebElement lengthOfStay;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue']")//(id = "next-step")
    WebElement continueButton2;



    public void selectLengthOfStay(String longerThanSixMonths) {
        lengthOfStay.click();
    }

    public void clickNextStepButton() {
        continueButton2.click();
    }
}
