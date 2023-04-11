package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealApr extends NavigationBar {
    private final By CalculatorTab = By.xpath("//label[1][text()='Calculator']");
    private final By HomePriceInputField = By.name("HomeValue");
    private final By DownPaymentInputField = By.name("DownPayment");
    private final By DownPaymentInDollar = By.id("DownPaymentSel0");
    private final By InterestRateInputField = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    private final By ActualRealAprRate = By.xpath("//*[text()='3.130%']");
    private static final Logger LOGGER = LogManager.getLogger(RealApr.class);

    public RealApr(WebDriver driver) {
     super(driver);
    }
    public RealApr waitForPageToLoad(){
        LOGGER.debug("Waiting for the page to load");
        ActOn.wait(driver, CalculatorTab).waitForElementToBeDisplayed();
        return this;
    }
    public RealApr typeHomePrice(String value) {
        LOGGER.debug("Typing the Home Value: " + value);
        ActOn.wait(driver, HomePriceInputField).waitForElementToBeDisplayed();
        return this;
    }
    public RealApr typeDownPayment(String value) {
     LOGGER.debug("Typing the down payment value: " + value);
     ActOn.element(driver, DownPaymentInputField).setValue(value);
     return this;
    }
    public RealApr selectDownPaymentInDollar() {
        LOGGER.debug("Clicking on the $ radio button");
        ActOn.element(driver,DownPaymentInDollar).click();
        return this;
    }
    public RealApr typeInterestRate(String value) {
        LOGGER.debug("Typing the interest rate value: " + value);
        ActOn.element(driver,InterestRateInputField).setValue(value);
        return this;
    }
    public RealApr clickOnCalculatorRateButton() {
        LOGGER.debug("Clicking on the calculator button");
        ActOn.element(driver, CalculateRateButton).click();
        return this;
    }
    public RealApr validateRealAprRate(String expectedValue) {
        LOGGER.debug("Validate the Real APR Rate is: " + expectedValue);
        //By ActualAprRate = null;
      String actualRealAprRate = ActOn.element(driver, ActualRealAprRate).getTextValue();
      Assert.assertEquals(actualRealAprRate, expectedValue);
      return this;
    }
}
