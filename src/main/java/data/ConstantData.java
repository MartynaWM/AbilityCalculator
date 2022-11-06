package data;

public class ConstantData {
    public static final int UPPER_LOAN_TERM_LIMITATION = 100;

    public static final double MAX_LOAN = 150000;

    public static final double MAX_COMMITMENT = 200000;

    public static final int MIN_LOAN_TERM = 6;

    public static final double MIN_LOAN_AMOUNT = 5000;

    public static final int MAX_LOAN_PERIOD_1 = 12;

    public static final int MAX_LOAN_PERIOD_2 = 36;

    public static final int MAX_LOAN_PERIOD_3 = 60;

    public double findDti(int loanPeriod) {
        double dti = 0;
        if (loanPeriod >= 6 && loanPeriod <= 36) {
            dti = 60;
        } else if (loanPeriod >= 37 && loanPeriod <= 60) {
            dti = 50;
        } else if (loanPeriod >= 61 && loanPeriod <= 100) {
            dti = 55;
        }
        return dti;
    }

    private int findInterest(int loanPeriod) {
        int interest = 0;
        if (loanPeriod >= 6 && loanPeriod <= 12) {
            interest = 2;
        } else if (loanPeriod >= 13 && loanPeriod <= 100) {
            interest = 3;
        }
        return interest;
    }

    public double findMi(int loanPeriod) {
        int interest = findInterest(loanPeriod);
        return (double) interest / (double) 100 / 12;
    }
}
