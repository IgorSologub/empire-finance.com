package constants;

import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://empire-finance.com/";
        public static final String LOANS_PAGE_URL = "https://empire-finance.com/loans";
        public static final String CREDIT_LOANS_PAGE_URL = "https://empire-finance.com/credit-cards";
        public static final String MORTGAGE_PAGE_URL = "https://empire-finance.com/mortgage";
        public static final String TEAM_PAGE_URL = "https://empire-finance.com/team";
        public static final String ORDER_PAGE_URL = "https://empire-finance.com/order";
        public static final String ORDER_REF_URL = "https://loansaccount.com/form/processing";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "Online on Empire Finance",
                "Advices on Empire Finance",
                "mortgage",
                "Make The Right Choice With Empire Finance"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 3;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "Best Lenders on Empire Finance",
                "Apply Online on Empire Finance",
                "Get Fast on Empire Finance",
                "Fast Personal Loans",
                "Advices on Empire Finance",
                "Best Loans",
                "Current mortgage rates for"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 5;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Best Lenders on Empire Finance",
                "Urgent Loans Online on Empire Finance",
                "Get Fast on Empire Finance",
                "Get Funds in Minutes on Empire Finance",
                "Get Fast on Empire Finance",
                "Get Cash on Empire Finance",
                "Apply Online on Empire Finance",
                "Fast Cash with No Fees on Empire Finance",
                "Full Review on Empire Finance",
                "Make The Right Choice With Empire Finance",
                "Reviews & Advices on Empire Finance",
                "Advices on Empire Finance",
                "Loans Review Loans",
                "Direct Lenders on Empire Finance",
                "Fast Personal Loans in Minutes",
                "fixed mortgage rates",
                "FHA Loan Rates",
                "VA Loan Rates",
                "Empire Finance"
        );
        public static final List<String> AUTHORS_TITLES = Arrays.asList(
                "Jonah Collins",
                "Irene Scott",
                "Destiny Richardson",
                "Quinanna Patterson"
        );
        public static final int NUMBER_OF_LOANS_BUTTONS_MAIN_PAGE = 4;
        public static final int NUMBER_OF_BROWSER_CATEGORIES_BUTTONS_MAIN_PAGE = 6;
        public static final int NUMBER_OF_READ_REVIEW_BUTTONS_MAIN_PAGE = 6;
        public static final int NUMBER_OF_READ_REVIEW_BUTTONS_LOANS_PAGE = 12;
        public static final int NUMBER_OF_BEST_LOANS_BUTTONS_LOANS_PAGE = 6;
        public static final int NUMBER_OF_APPLY_NOW_BUTTONS_CREDIT_LOANS_PAGE = 5;
        public static final int NUMBER_OF_BEST_REWARDS_CARDS_BUTTONS_CREDIT_LOANS_PAGE = 5;
        public static final int NUMBER_OF_READ_REVIEW_BUTTONS_MORTGAGE_PAGE = 8;
        public static final int NUMBER_OF_RELATED_LINKS_BUTTONS_MORTGAGE_PAGE = 5;
        public static final int NUMBER_OF_AUTHOR_BUTTONS_TEAM_PAGE = 4;

    }

    public static class Order {
        public static final String EMAIL = "admintest123@gmail.com";
        public static final String PHONE_NUMBER = "3103400791";
        public static final String SSN = "4214";
        public static final String FIRST_NAME = "John";
        public static final String SECOND_NAME = "Smith";
        public static final String DATE_OF_BIRTH = "04141994";
        public static final String ZIP_CODE = "92210";
        public static final String STREET_ADDRESS = "Garden Lane 90210";
        public static final String ABA_ROUTING_NUMBER = "124003116";
        public static final String BANK_ACCOUNT_NUMBER = "56712365716757";
        public static final String DRIVER_LICENSE_NUMBER = "12421412414";
        public static final String SOCIAL_SECURITY_NUMBER = "421512525";
    }
}
