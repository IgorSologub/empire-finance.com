package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.creditLoans.CreditLoansPage;
import pages.loans.LoansPage;
import pages.main.MainPage;
import pages.mortgage.MortgagePage;
import pages.order.OrderPage;
import pages.team.TeamPage;

public class BaseTest {

    public BasePage basePage;
    public CreditLoansPage creditLoansPage;
    public LoansPage loansPage;
    public MainPage mainPage;
    public MortgagePage mortgagePage;
    public OrderPage orderPage;
    public TeamPage teamPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "loans" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "creditLoans" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "mortgage" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
            case "team" :
                driver = CommonActions.createDriver("CHROME", 1024, 768);
                break;
            case "order" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
        }
        basePage = new BasePage(driver);
        creditLoansPage = new CreditLoansPage(driver);
        loansPage = new LoansPage(driver);
        mainPage = new MainPage(driver);
        mortgagePage = new MortgagePage(driver);
        orderPage = new OrderPage(driver);
        teamPage = new TeamPage(driver);

    }

    @AfterEach
    public void clearCookiesAndExit () {
        basePage.clearCookiesAndLocalStorageAndClose();
    }
}
