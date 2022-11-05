package implementation;

import data.ConstantData;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static data.ConstantData.MAX_COMMITMENT;
import static data.ConstantData.MAX_LOAN;

public class MaxLoanAmountCalculation {

    private final ConstantData constantData = new ConstantData();

    public double calculateMaxLoanAmount(double sumOfCreditBalances, double maxMonthlyInstalment, int maxLoanPeriod) {
        double firstOptionMaxLoanAmount = calculateFirstOption(sumOfCreditBalances);
        double secondOptionMaxLoanAmount = calculateSecondOption(maxMonthlyInstalment, maxLoanPeriod);
        return createMaxLoanAmount(firstOptionMaxLoanAmount, secondOptionMaxLoanAmount);

    }

    private double calculateFirstOption(double sumOfCreditBalances) {
        return MAX_COMMITMENT - sumOfCreditBalances;
    }

    private double calculateSecondOption(double maxMonthlyInstalment, int maxLoanPeriod) {
        double mi = constantData.findMi(maxLoanPeriod);
        double pow = 1 / Math.pow((1 + mi), maxLoanPeriod);

        return maxMonthlyInstalment * (1 - pow) / mi;
    }

    private double createMaxLoanAmount(double firstOptionMaxLoanAmount, double secondOptionMaxLoanAmount) {
        double maxLoanAmount = Math.min(MAX_LOAN, Math.min(firstOptionMaxLoanAmount, secondOptionMaxLoanAmount));
        BigDecimal maxLoanAmountAsBigDecimal = BigDecimal
            .valueOf(maxLoanAmount)
            .setScale(2, RoundingMode.HALF_EVEN);
        maxLoanAmount = maxLoanAmountAsBigDecimal.doubleValue();
        return maxLoanAmount;
    }
}