package tests.loans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.LOANS_PAGE_URL;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoansTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("loans");
        basePage.goToUrl(LOANS_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void headerButtonsTest () {
        int goodTitlesCount = 0;
        for (int i = 2; i <= NUMBER_OF_GOOD_HEADER_BUTTONS + 1; i++) {
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(MAIN_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void footerButtonsTest () {
        int goodTitlesCount = 0;
        basePage.waitOneSeconds();
        basePage.footerButtonClick(1);
        basePage.waitOneSeconds();
        if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
        else { basePage.outputWrongTitle(); }
        basePage.back(MAIN_PAGE_URL);

        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void readReviewButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_READ_REVIEW_BUTTONS_LOANS_PAGE; i++) {
            basePage.waitOneSeconds();
            loansPage.readReviewButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitOneSeconds();
            basePage.back(LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_READ_REVIEW_BUTTONS_LOANS_PAGE, goodTitlesCount);
    }

    @Test
    public void bestLoansButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_BEST_LOANS_BUTTONS_LOANS_PAGE; i++) {
            basePage.waitOneSeconds();
            loansPage.bestLoansButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitOneSeconds();
            basePage.back(LOANS_PAGE_URL);
        }
        assertEquals(NUMBER_OF_BEST_LOANS_BUTTONS_LOANS_PAGE, goodTitlesCount);
    }

}
