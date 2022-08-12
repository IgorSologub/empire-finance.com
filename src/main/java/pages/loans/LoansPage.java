package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class LoansPage extends BasePage {

    public LoansPage (WebDriver driver) {super(driver);}

    public LoansPage bestLoansButtonClick (int numButton) {
        By loansButton = By.xpath("(//a[@class='c-banner-compare__item'])[" + numButton + "]");
        driver.findElement(loansButton).click();
        return this;
    }

    public LoansPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='c-btn c-btn--main c-tb-loans__btn'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

}
