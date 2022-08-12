package tests.team;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reviews.AUTHORS_TITLES;
import static constants.Constant.Reviews.NUMBER_OF_AUTHOR_BUTTONS_TEAM_PAGE;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.TEAM_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("team");
        basePage.goToUrl(TEAM_PAGE_URL);
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
            basePage.back(TEAM_PAGE_URL);
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
            basePage.back(TEAM_PAGE_URL);
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
    public void authorButtonTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_AUTHOR_BUTTONS_TEAM_PAGE; i++) {
            basePage.waitOneSeconds();
            teamPage.authorButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(AUTHORS_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(TEAM_PAGE_URL);
        }
        assertEquals(NUMBER_OF_AUTHOR_BUTTONS_TEAM_PAGE, goodTitlesCount);
    }

}
