package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(id = "immigration-status-yes")
    WebElement yes;

    @CacheLookup
    @FindBy(id = "immigration-status-no")
    WebElement no;

    @CacheLookup
    @FindBy(id = "next-step")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status) {
        switch (status.toLowerCase()) {
            case "yes":
                yes.click();
                break;
            case "no":
                no.click();
                break;
        }
    }

    public void clickNextStepButton() {
        nextStepButton.click();
    }
}
