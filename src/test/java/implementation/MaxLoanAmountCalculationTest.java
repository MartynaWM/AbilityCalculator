package implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxLoanAmountCalculationTest {
    MaxLoanAmountCalculation maxLoanAmountCalculation;

    double sumOfCreditBalances;

    double maxMonthlyInstalment;

    int maxLoanPeriod;

    @Test
    void shouldReturnFirstOptionAsMinimum() {
        //GIVEN
        sumOfCreditBalances = 150000;

        maxMonthlyInstalment = 6000;

        maxLoanPeriod = 36;

        double expectedMaxLoanAmount = 50000.00;

        maxLoanAmountCalculation = new MaxLoanAmountCalculation();

        //WHEN
        double maxLoanAmount = maxLoanAmountCalculation.calculateMaxLoanAmount(sumOfCreditBalances,
            maxMonthlyInstalment, maxLoanPeriod);

        //THEN
        assertEquals(expectedMaxLoanAmount, maxLoanAmount);
    }

    @Test
    void shouldReturnSecondOptionAsMinimum() {
        //GIVEN
        sumOfCreditBalances = 40000;

        maxMonthlyInstalment = 6000;

        maxLoanPeriod = 12;

        double expectedMaxLoanAmount = 71226.03;

        maxLoanAmountCalculation = new MaxLoanAmountCalculation();

        //WHEN
        double maxLoanAmount = maxLoanAmountCalculation.calculateMaxLoanAmount(sumOfCreditBalances,
            maxMonthlyInstalment, maxLoanPeriod);

        //THEN
        assertEquals(expectedMaxLoanAmount, maxLoanAmount);
    }

    @Test
    void shouldReturnMaxLoanConstantDataAsMinimum() {
        //GIVEN
        sumOfCreditBalances = 15000;

        maxMonthlyInstalment = 6000;

        maxLoanPeriod = 36;

        double expectedMaxLoanAmount = 150000;

        maxLoanAmountCalculation = new MaxLoanAmountCalculation();

        //WHEN
        double maxLoanAmount = maxLoanAmountCalculation.calculateMaxLoanAmount(sumOfCreditBalances,
            maxMonthlyInstalment, maxLoanPeriod);

        //THEN
        assertEquals(expectedMaxLoanAmount, maxLoanAmount);

    }
}