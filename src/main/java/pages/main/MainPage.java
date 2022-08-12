package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage (WebDriver driver) {super(driver);}

    private final By getStartedRegButton = By.xpath("//a[@class='c-btn c-btn--main c-banner__btn']");
    private final By seeAllTheWinnersButton = By.xpath("//a[@class='c-btn c-btn--secondary c-banner-winners__btn']");
    private final By faqButton = By.xpath("(//li[@class='c-faq-box__question-box panel js-collapse'])[1]");
    private final By faqTextBlock = By.xpath("(//div[@class='c-faq-box__collapse-box'])[1]");

    public MainPage getStartedRegButtonClick () {
        driver.findElement(getStartedRegButton).click();
        return this;
    }

    public MainPage loansButtonClick (int numButton) {
        By loansButton = By.xpath("(//li[@class='c-nav__item'])[" + numButton + "]");
        driver.findElement(loansButton).click();
        return this;
    }

    public MainPage browseCategoriesButtonClick (int numButton) {
        By browseCategoriesButton = By.xpath("(//a[@class='c-categories__item'])[" + numButton + "]");
        driver.findElement(browseCategoriesButton).click();
        return this;
    }

    public MainPage seeAllTheWinnersButtonClick () {
        driver.findElement(seeAllTheWinnersButton).click();
        return this;
    }

    public MainPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='c-btn c-btn--main c-tb-categories__btn'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MainPage faqButtonClick () {
        driver.findElement(faqButton).click();
        return this;
    }

    public boolean faqTextBlockCheck () {
        return driver.findElement(faqTextBlock).isDisplayed();
    }

}
