package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@value='tourism']")
    WebElement tourismOrVisitingFamily;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademicVisit;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerorFamily;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement ContinueButton1;



    public void selectReasonForVisit() {
        tourismOrVisitingFamily.click();
    }

    public void selectedReasonForVisit() {
        clickOnElement(workAcademicVisit);
    }

    public void reasonForVisit(){
        clickOnElement(joinPartnerorFamily);

    }

    public void clickNextStepButton() {
        ContinueButton1.click();
    }
}
