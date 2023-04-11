package automation_test.mortgage_culcalator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class CalculateRealAprRate {

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");

    }

    @Test
    public void calculateRealApr(){
        WebDriver driver = null;
        new NavigationBar(driver)
              .mouseHoverToRates()
              .navigateToRealApr()
              .waitForPageToLoad()
              .typeHomePrice("200000")
              .typeDownPayment("15000")
              .selectDownPaymentInDollar()
              .typeInterestRate("3")
              .clickOnCalculatorRateButton()
              .validateRealAprRate("3.130%");




        // Click on Calculate Button
        //ActOn.element(driver, CalculateRateButton).click();

        //Validate the Real Apr Rate is "3.130%"
        //String actualRealAprRate = driver.findElement(ActualRealAprRate).getText();
        //Assert.assertEquals(actualRealAprRate, "3.130%");
        //AssertThat.elementAssertions(driver, ActualRealAprRate).elementIsDisplayed();
    }
    @AfterMethod
    public void closeBrowser(){
        WebDriver driver = null;
        ActOn.browser(driver).closeBrowser();
    }


}
