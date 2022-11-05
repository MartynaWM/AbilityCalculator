package data;

public class UserData {
    private final int employmentPeriod;

    private final double monthlyIncome;

    private final double monthlyMaintenanceCosts;

    private final double monthlyCreditObligations;

    private final double sumOfCreditBalances;

    public UserData(int employmentPeriod, double monthlyIncome, double monthlyMaintenanceCosts,
        double monthlyCreditObligations,
        double sumOfCreditBalances) {
        this.employmentPeriod = employmentPeriod;
        this.monthlyIncome = monthlyIncome;
        this.monthlyMaintenanceCosts = monthlyMaintenanceCosts;
        this.monthlyCreditObligations = monthlyCreditObligations;
        this.sumOfCreditBalances = sumOfCreditBalances;
    }

    public int getEmploymentPeriod() {
        return employmentPeriod;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double getMonthlyMaintenanceCosts() {
        return monthlyMaintenanceCosts;
    }

    public double getMonthlyCreditObligations() {
        return monthlyCreditObligations;
    }

    public double getSumOfCreditBalances() {
        return sumOfCreditBalances;
    }

}
