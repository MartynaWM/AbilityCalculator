package implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxLoanPeriodCalculationTest {

    MaxLoanPeriodCalculation maxLoanPeriodCalculation;

    @Test
    void shouldReturnEmploymentPeriodWhenItIsLessThen100() {
        //GIVEN
        int employmentPeriod = 50;
        int expectedEmploymentPeriod = 50;
        maxLoanPeriodCalculation = new MaxLoanPeriodCalculation();

        //WHEN
        int maxLoanPeriod = maxLoanPeriodCalculation.calculateMaxLoanPeriod(employmentPeriod);

        //THEN
        assertEquals(expectedEmploymentPeriod, maxLoanPeriod);
    }

    @Test
    void shouldReturn100WhenEmploymentPeriodIsMoreThen100() {
        //GIVEN
        int employmentPeriod = 101;
        int expectedEmploymentPeriod = 100;
        maxLoanPeriodCalculation = new MaxLoanPeriodCalculation();

        //WHEN
        int maxLoanPeriod = maxLoanPeriodCalculation.calculateMaxLoanPeriod(employmentPeriod);

        //THEN
        assertEquals(expectedEmploymentPeriod, maxLoanPeriod);
    }
}