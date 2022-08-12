package tests.creditLoans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditLoansTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("creditLoans");
        basePage.goToUrl(CREDIT_LOANS_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void headerButtonsTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(CREDIT_LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void footerButtonsTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            if (i == 7) {i++; goodTitlesCount++;}
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(CREDIT_LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void getStartedRegButtonTest () {
        basePage.waitOneSeconds();
        creditLoansPage.getStartedRegButtonClick();
        assertTrue(basePage.checkUrl(ORDER_PAGE_URL));
    }

    @Test
    public void applyNowRegButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_APPLY_NOW_BUTTONS_CREDIT_LOANS_PAGE; i++) {
            basePage.waitOneSeconds();
            creditLoansPage.applyNowRegButtonClick(i);
            basePage.waitFiveSeconds();
            if (basePage.checkUrl(ORDER_PAGE_URL)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitFiveSeconds();
            basePage.back(CREDIT_LOANS_PAGE_URL);
            basePage.back(CREDIT_LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_APPLY_NOW_BUTTONS_CREDIT_LOANS_PAGE, goodTitlesCount);
    }

    @Test
    public void bestRewardCardsButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_BEST_REWARDS_CARDS_BUTTONS_CREDIT_LOANS_PAGE; i++) {
            basePage.waitOneSeconds();
            creditLoansPage.bestRewardCardsButtonClick(i);
            basePage.waitFiveSeconds();
            if (basePage.checkUrl(ORDER_PAGE_URL)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitFiveSeconds();
            basePage.back(CREDIT_LOANS_PAGE_URL);
            basePage.back(CREDIT_LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_BEST_REWARDS_CARDS_BUTTONS_CREDIT_LOANS_PAGE, goodTitlesCount);
    }

    @Test
    public void faqButtonTest () {
        basePage.waitOneSeconds();
        creditLoansPage.faqButtonClick();
        basePage.waitFiveSeconds();
        assertTrue(creditLoansPage.faqTextBlockCheck());
    }

}
