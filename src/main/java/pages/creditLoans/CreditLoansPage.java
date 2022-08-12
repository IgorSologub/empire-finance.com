package pages.creditLoans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CreditLoansPage extends BasePage {

    public CreditLoansPage (WebDriver driver) {super(driver);}

    private final By getStartedRegButton = By.xpath("//a[@class='c-btn c-btn--main c-banner__btn']");
    private final By faqButton = By.xpath("(//li[@class='c-faq-box__question-box panel js-collapse'])[1]");
    private final By faqTextBlock = By.xpath("(//div[@class='c-faq-box__collapse-box'])[1]");

    public CreditLoansPage getStartedRegButtonClick () {
        driver.findElement(getStartedRegButton).click();
        return this;
    }

    public CreditLoansPage applyNowRegButtonClick (int numButton) {
        By loansButton = By.xpath("(//a[@class='c-btn c-btn--main c-credit-card__btn'])[" + numButton + "]");
        driver.findElement(loansButton).click();
        return this;
    }

    public CreditLoansPage bestRewardCardsButtonClick (int numButton) {
        By loansButton = By.xpath("(//a[@class='c-btn c-btn--secondary c-credit-card__btn-rating'])[" + numButton + "]");
        driver.findElement(loansButton).click();
        return this;
    }

    public CreditLoansPage faqButtonClick () {
        driver.findElement(faqButton).click();
        return this;
    }

    public boolean faqTextBlockCheck () {
        return driver.findElement(faqTextBlock).isDisplayed();
    }

}
