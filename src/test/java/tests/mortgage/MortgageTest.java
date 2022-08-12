package tests.mortgage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.*;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.MORTGAGE_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MortgageTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("mortgage");
        basePage.goToUrl(MORTGAGE_PAGE_URL);
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
            basePage.back(MORTGAGE_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void footerButtonsTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(MORTGAGE_PAGE_URL);
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
    public void chooseYourStateButtonTest () {
        mortgagePage.chooseYourStateButtonClick();
        basePage.waitFiveSeconds();
        mortgagePage.stateButtonClick();
        basePage.waitFiveSeconds();
        assertTrue(mortgagePage.stateUrlCheck());
    }

    @Test
    public void readReviewButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_READ_REVIEW_BUTTONS_MORTGAGE_PAGE; i++) {
            basePage.waitOneSeconds();
            mortgagePage.readReviewButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitOneSeconds();
            basePage.back(MORTGAGE_PAGE_URL);
        }
        assertEquals(NUMBER_OF_READ_REVIEW_BUTTONS_MORTGAGE_PAGE, goodTitlesCount);
    }

    @Test
    public void faqButtonTest () {
        basePage.waitOneSeconds();
        mortgagePage.faqButtonClick();
        basePage.waitFiveSeconds();
        assertTrue(mortgagePage.faqTextBlockCheck());
    }

    @Test
    public void relatedLinksButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_RELATED_LINKS_BUTTONS_MORTGAGE_PAGE; i++) {
            basePage.waitOneSeconds();
            mortgagePage.relatedLinksButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(REVIEW_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.waitOneSeconds();
            basePage.back(MORTGAGE_PAGE_URL);
        }
        assertEquals(NUMBER_OF_RELATED_LINKS_BUTTONS_MORTGAGE_PAGE, goodTitlesCount);
    }

}
