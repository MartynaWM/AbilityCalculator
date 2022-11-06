package data;

public class Offer {
    private final int maxLoanPeriod;

    private final double maxMonthlyInstalment;

    private final double maxCreditAmount;

    public int getMaxLoanPeriod() {
        return maxLoanPeriod;
    }

    public double getMaxMonthlyInstalment() {
        return maxMonthlyInstalment;
    }

    public double getMaxCreditAmount() {
        return maxCreditAmount;
    }

    public Offer(int maxLoanPeriod, double maxMonthlyInstalment, double maxCreditAmount) {
        this.maxLoanPeriod = maxLoanPeriod;
        this.maxMonthlyInstalment = maxMonthlyInstalment;
        this.maxCreditAmount = maxCreditAmount;
    }

    @Override
    public String toString() {
        if (maxLoanPeriod >= 6 && maxLoanPeriod <= 12) {
            return "Your Offer for loan period for [6 to " + maxLoanPeriod + "] months is: \n" +
                "maxLoanPeriod=" + maxLoanPeriod + ",\n" +
                "maxMonthlyInstalment=" + maxMonthlyInstalment + ",\n" +
                "maxCreditAmount=" + maxCreditAmount + ".\n";

        }
        if (maxLoanPeriod >= 13 && maxLoanPeriod <= 36) {
            return "Your Offer for loan period for (12 to " + maxLoanPeriod + "] months is: \n" +
                "maxLoanPeriod=" + maxLoanPeriod + ",\n" +
                "maxMonthlyInstalment=" + maxMonthlyInstalment + ",\n" +
                "maxCreditAmount=" + maxCreditAmount + ".\n";
        }
        if (maxLoanPeriod >= 37 && maxLoanPeriod <= 60) {
            return "Your Offer for loan period for (36 to " + maxLoanPeriod + "] months is: \n" +
                "maxLoanPeriod=" + maxLoanPeriod + ",\n" +
                "maxMonthlyInstalment=" + maxMonthlyInstalment + ",\n" +
                "maxCreditAmount=" + maxCreditAmount + ".\n";
        }
        if (maxLoanPeriod >= 61 && maxLoanPeriod <= 100) {
            return "Your Offer for loan period for (60 to " + maxLoanPeriod + "] months is: \n" +
                "maxLoanPeriod=" + maxLoanPeriod + ",\n" +
                "maxMonthlyInstalment=" + maxMonthlyInstalment + ",\n" +
                "maxCreditAmount=" + maxCreditAmount + ".\n";
        } else {
            return "Your Offer is: " +
                "maxLoanPeriod=" + maxLoanPeriod +
                "maxMonthlyInstalment=" + maxMonthlyInstalment +
                "maxCreditAmount=" + maxCreditAmount;
        }
    }
}