package implementation;

import static data.ConstantData.UPPER_LOAN_TERM_LIMITATION;

public class MaxLoanPeriodCalculation {

    public int calculateMaxLoanPeriod(int employmentPeriod) {
        return Math.min(employmentPeriod, UPPER_LOAN_TERM_LIMITATION);
    }
}