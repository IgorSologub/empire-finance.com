package pages.mortgage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

import java.util.Base64;

public class MortgagePage extends BasePage {

    public MortgagePage (WebDriver driver) {super(driver);}

    private final By chooseYourStateButton = By.xpath("//span[@class='select2-selection__rendered']");
    private final By stateButton = By.xpath("(//li[@class='select2-results__option select2-results__option--selectable'])[43]");
    private final By faqButton = By.xpath("(//li[@class='c-faq-box__question-box panel js-collapse'])[1]");
    private final By faqTextBlock = By.xpath("(//div[@class='c-faq-box__collapse-box'])[1]");

    public MortgagePage chooseYourStateButtonClick () {
        driver.findElement(chooseYourStateButton).click();
        return this;
    }

    public MortgagePage stateButtonClick () {
        driver.findElement(stateButton).click();
        return this;
    }

    public boolean stateUrlCheck () {
        return driver.getCurrentUrl().contains("https://empire-finance.com/mortgage/utah");
    }

    public MortgagePage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='c-btn c-btn--main c-tb-loans__btn'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MortgagePage faqButtonClick () {
        driver.findElement(faqButton).click();
        return this;
    }

    public boolean faqTextBlockCheck () {
        return driver.findElement(faqTextBlock).isDisplayed();
    }

    public MortgagePage relatedLinksButtonClick (int numButton) {
        By relatedLinksButton = By.xpath("(//a[@class='c-links-box__item'])[" + numButton + "]");
        driver.findElement(relatedLinksButton).click();
        return this;
    }
}
