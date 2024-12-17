package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectNationalityPage extends Utility {

   @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
   WebElement nationalityDropDownList;

   @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement Continue;

    public void selectNationality(String nationality) {

        nationalityDropDownList.sendKeys(nationality);
    }

    public void clickNextStepButton() {
        Continue.click();
    }

    public boolean isCountryInDropdown(String country) {
        List<WebElement> countries = driver.findElements((By) nationalityDropDownList);
        for (WebElement countryElement : countries) {
            if (countryElement.getText().equalsIgnoreCase(country)) {
                return true;
            }
        }
        return false;
    }
}
