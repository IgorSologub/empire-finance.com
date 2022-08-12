package pages.team;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.mortgage.MortgagePage;

public class TeamPage extends BasePage {

    public TeamPage (WebDriver driver) {super(driver);}

    public TeamPage authorButtonClick (int numButton) {
        By relatedLinksButton = By.xpath("(//div[@class='c-worker__name'])[" + numButton + "]");
        driver.findElement(relatedLinksButton).click();
        return this;
    }

}
