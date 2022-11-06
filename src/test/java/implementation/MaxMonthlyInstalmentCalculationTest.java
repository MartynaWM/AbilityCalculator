package implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMonthlyInstalmentCalculationTest {
    MaxMonthlyInstalmentCalculation maxMonthlyInstalmentCalculation;

    double monthlyIncome;

    double monthlyMaintenanceCosts;

    double monthlyCreditObligations;

    int maxLoanPeriod;

    @Test
    void shouldReturnFirstOptionAsMinimum() {
        //GIVEN
        monthlyIncome = 15000;
        monthlyMaintenanceCosts = 7000;
        monthlyCreditObligations = 3000;
        maxLoanPeriod = 60;
        maxMonthlyInstalmentCalculation = new MaxMonthlyInstalmentCalculation();

        double expectedMonthlyInstalment = 5000.00;

        //WHEN
        double maxMonthlyInstalment = maxMonthlyInstalmentCalculation.calculateMaxMonthlyInstalmentCalculation(
            monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations, maxLoanPeriod);

        //THEN
        assertEquals(expectedMonthlyInstalment, maxMonthlyInstalment);
    }

    @Test
    void shouldReturnSecondOptionAsMinimum() {
        //GIVEN
        monthlyIncome = 15000;
        monthlyMaintenanceCosts = 3000;
        monthlyCreditObligations = 1000;
        maxLoanPeriod = 60;
        maxMonthlyInstalmentCalculation = new MaxMonthlyInstalmentCalculation();

        double expectedMonthlyInstalment = 7000.00;

        //WHEN
        double maxMonthlyInstalment = maxMonthlyInstalmentCalculation.calculateMaxMonthlyInstalmentCalculation(
            monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations, maxLoanPeriod);

        //THEN
        assertEquals(expectedMonthlyInstalment, maxMonthlyInstalment);
    }
}