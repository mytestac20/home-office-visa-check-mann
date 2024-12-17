package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {

//    @CacheLookup
//    @FindBy(id = "result-message")
//    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageNeedVisa;

    public String getResultMessage() {
        return resultMessage.getText();
    }

    public String getResultMessage1(){
        return resultMessageNeedVisa.getText();
    }

    public void confirmResultMessage(String expectedMessage) {
        Assert.assertTrue(getResultMessage().contains(expectedMessage));
    }
}
