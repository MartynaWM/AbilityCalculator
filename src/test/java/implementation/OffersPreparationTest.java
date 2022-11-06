package implementation;

import application.PrepareOffer;
import data.Offer;
import data.UserData;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OffersPreparationTest {
    PrepareOffer prepareOffer;

    UserData userData;

    int employmentPeriod;

    double monthlyIncome = 12000;

    double monthlyMaintenanceCosts = 3500;

    double monthlyCreditObligations = 2800;

    double sumOfCreditBalances = 10000;

    OffersPreparation offersPreparation;

    int maxLoanPeriod;

    @Test
    void shouldPrepareOneOfferWhenMaxLoanPeriodIs12() {
        //GIVEN
        employmentPeriod = 12;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 1;
        int expectedLoanPeriod = 12;
        double expectedMaxMonthlyInstalment = 5520.00;
        double expectedMaxCreditAmount = 65527.95;

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(0)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(0)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(0)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareTwoOffersWhenMaxLoanPeriodIs13() {
        //GIVEN
        employmentPeriod = 13;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 2;
        int expectedLoanPeriod = 13;
        double expectedMaxMonthlyInstalment = 5520.00;
        double expectedMaxCreditAmount = 70519.74;

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(1)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(1)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(1)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareTwoOffersWhenMaxLoanPeriodIs36() {
        //GIVEN
        employmentPeriod = 36;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 2;
        int expectedLoanPeriod = 36;
        double expectedMaxMonthlyInstalment = 5520.00;
        double expectedMaxCreditAmount = 150000.00;

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(1)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(1)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(1)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareThreeOffersWhenMaxLoanPeriodIs37() {
        //GIVEN
        employmentPeriod = 37;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 3;
        int expectedLoanPeriod = 37;
        double expectedMaxMonthlyInstalment = 4600.00;
        double expectedMaxCreditAmount = 150000.00;

        this.offersPreparation = new OffersPreparation();
        this.prepareOffer = new PrepareOffer();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(2)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(2)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(2)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareTwoOffersWhenMaxLoanPeriodIs60() {
        //GIVEN
        employmentPeriod = 60;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 3;
        int expectedLoanPeriod = 60;
        double expectedMaxMonthlyInstalment = 4600.00;
        double expectedMaxCreditAmount = 150000.00;

        this.offersPreparation = new OffersPreparation();
        this.prepareOffer = new PrepareOffer();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(2)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(2)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(2)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareFourOffersWhenMaxLoanPeriodIs61() {
        //GIVEN
        employmentPeriod = 61;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 4;
        int expectedLoanPeriod = 61;
        double expectedMaxMonthlyInstalment = 5060.00;
        double expectedMaxCreditAmount = 150000.00;

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(3)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(3)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(3)
            .getMaxCreditAmount());
    }

    @Test
    void shouldPrepareFourOffersWhenMaxLoanPeriodIs100() {
        //GIVEN
        employmentPeriod = 100;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        int expectedListSize = 4;
        int expectedLoanPeriod = 100;
        double expectedMaxMonthlyInstalment = 5060.00;
        double expectedMaxCreditAmount = 150000.00;

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertNotNull(offers);
        assertEquals(expectedListSize, offers.size());
        assertEquals(expectedLoanPeriod, offers
            .get(3)
            .getMaxLoanPeriod());
        assertEquals(expectedMaxMonthlyInstalment, offers
            .get(3)
            .getMaxMonthlyInstalment());
        assertEquals(expectedMaxCreditAmount, offers
            .get(3)
            .getMaxCreditAmount());
    }

    @Test
    void shouldReturnEmptyListOfOffersWhenEmploymentPeriodIsNull() {
        //GIVEN
        employmentPeriod = 0;
        maxLoanPeriod = employmentPeriod;

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        this.offersPreparation = new OffersPreparation();

        //WHEN
        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        //THEN
        assertTrue(offers.isEmpty());
    }
}