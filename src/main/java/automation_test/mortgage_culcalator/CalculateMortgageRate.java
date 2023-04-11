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
import utilities.DateUtils;

public class  CalculateMortgageRate {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //driver.get("https://www.mortgagecalculator.org/");
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
        //driver.manage().window().maximize();

    }
    @Test
    public void calculatorMonthlyPayment() {
        String[] date = DateUtils.returnNextMonth();

        new NavigationBar(driver)
                .navigateToHome()
                .typeHomePrice("300000")
                .typeDownPayment("60000")
                .clickDownPaymentInDollar()
                .typeLoanAmount("240000")
                .typeInterestRate("3")
                .typeLoanTermYears("30")
                .SelectMonth(date[0])
                .typeYear(date[1])
                .typePropertyTax("5000")
                .typePMI("0.5")
                .typeHomeOwnerInsurance("1000")
                .typeMonthlyHoa("100")
                .selectLoanType("FHA")
                .selectBuyOrRefinance("Buy")
                .clickOnCalculatorButton()
                .validateTotalMonthlyPayment("1,611.85");

    }
    @AfterMethod
    public void closeBrowser(){

        ActOn.browser(driver).closeBrowser();
    }
}
