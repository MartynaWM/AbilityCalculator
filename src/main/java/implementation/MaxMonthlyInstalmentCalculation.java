package implementation;

import data.ConstantData;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MaxMonthlyInstalmentCalculation {
    private final ConstantData constantData = new ConstantData();

    public double calculateMaxMonthlyInstalmentCalculation(double monthlyIncome, double monthlyMaintenanceCosts,
        double monthlyCreditObligations, int maxLoanPeriod) {
        double firstOptionMaxMonthlyInstalment = calculateFirstOption(monthlyIncome, monthlyMaintenanceCosts,
            monthlyCreditObligations);
        double secondOptionMaxMonthlyInstalment = calculateSecondOption(monthlyIncome, monthlyCreditObligations,
            maxLoanPeriod);
        return createMaxMonthlyInstalment(firstOptionMaxMonthlyInstalment, secondOptionMaxMonthlyInstalment);
    }

    private double calculateFirstOption(double monthlyIncome, double monthlyMaintenanceCosts,
        double monthlyCreditObligations) {
        return monthlyIncome - monthlyMaintenanceCosts - monthlyCreditObligations;
    }

    private double calculateSecondOption(double monthlyIncome, double monthlyCreditObligations, int maxLoanPeriod) {
        double dti = constantData.findDti(maxLoanPeriod);
        return dti * (monthlyIncome - monthlyCreditObligations) / 100;
    }

    private double createMaxMonthlyInstalment(double firstOptionMaxMonthlyInstalment,
        double secondOptionMaxMonthlyInstalment) {
        double maxMonthlyInstalment = Math.min(firstOptionMaxMonthlyInstalment, secondOptionMaxMonthlyInstalment);
        BigDecimal maxMonthlyInstalmentAsBigDecimal = BigDecimal
            .valueOf(maxMonthlyInstalment)
            .setScale(2,
                RoundingMode.HALF_EVEN);
        maxMonthlyInstalment = maxMonthlyInstalmentAsBigDecimal.doubleValue();
        return maxMonthlyInstalment;
    }
}
