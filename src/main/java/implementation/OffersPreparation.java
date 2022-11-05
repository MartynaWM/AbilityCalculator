
package implementation;

import data.Offer;
import data.UserData;
import exceptions.NoAbilityException;

import java.util.ArrayList;
import java.util.List;

import static data.ConstantData.MAX_LOAN_PERIOD_1;
import static data.ConstantData.MAX_LOAN_PERIOD_2;
import static data.ConstantData.MAX_LOAN_PERIOD_3;
import static data.ConstantData.MIN_LOAN_AMOUNT;

public class OffersPreparation {
    private final MaxMonthlyInstalmentCalculation maxMonthlyInstalmentCalculation = new MaxMonthlyInstalmentCalculation();

    private final MaxLoanAmountCalculation maxLoanAmountCalculation = new MaxLoanAmountCalculation();

    private final List<Offer> offers = new ArrayList<>();


    public List<Offer> prepareOffers(int maxLoanPeriod, UserData userData) {

        if (maxLoanPeriod >= 6 && maxLoanPeriod <= 12) {
            prepareOffer(maxLoanPeriod, userData);
        } else if (maxLoanPeriod >= 13 && maxLoanPeriod <= 36) {
            prepareOffer(MAX_LOAN_PERIOD_1, userData);
            prepareOffer(maxLoanPeriod, userData);
        } else if (maxLoanPeriod >= 37 && maxLoanPeriod <= 60) {
            prepareOffer(MAX_LOAN_PERIOD_1, userData);
            prepareOffer(MAX_LOAN_PERIOD_2, userData);
            prepareOffer(maxLoanPeriod, userData);
        } else if (maxLoanPeriod >= 61 && maxLoanPeriod <= 100) {
            prepareOffer(MAX_LOAN_PERIOD_1, userData);
            prepareOffer(MAX_LOAN_PERIOD_2, userData);
            prepareOffer(MAX_LOAN_PERIOD_3, userData);
            prepareOffer(maxLoanPeriod, userData);
        }
        return offers;
    }

    private void prepareOffer(int maxLoanPeriod, UserData userData) {
        double maxMonthlyInstalment = calculateMaxMonthlyInstalment(maxLoanPeriod, userData);
        double maxLoanAmount = calculateMaxLoanAmount(maxLoanPeriod, userData, maxMonthlyInstalment);
        makeOffer(maxLoanPeriod, maxMonthlyInstalment, maxLoanAmount);
    }

    private double calculateMaxMonthlyInstalment(int maxLoanPeriod, UserData userData) {
        return maxMonthlyInstalmentCalculation.calculateMaxMonthlyInstalmentCalculation(
            userData.getMonthlyIncome(), userData.getMonthlyMaintenanceCosts(), userData.getMonthlyCreditObligations(),
            maxLoanPeriod);
    }

    private double calculateMaxLoanAmount(int maxLoanPeriod, UserData userData, double maxMonthlyInstalment) {
        double maxLoanAmount = maxLoanAmountCalculation.calculateMaxLoanAmount(userData.getSumOfCreditBalances(),
            maxMonthlyInstalment, maxLoanPeriod);
        try {
            checkMaxLoanAmount(maxLoanAmount);
        } catch (NoAbilityException exception) {

            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return maxLoanAmount;
    }

    private void makeOffer(int maxLoanPeriod, double maxMonthlyInstalment, double maxLoanAmount) {
        Offer offer = new Offer(maxLoanPeriod, maxMonthlyInstalment, maxLoanAmount);
        offers.add(offer);
    }

    private void checkMaxLoanAmount(double maxLoanAmount) throws NoAbilityException {
        if (maxLoanAmount < MIN_LOAN_AMOUNT) {
            throw new NoAbilityException("Sorry, we have no offer for you, you have no available credit capacity");
        }
    }

}
