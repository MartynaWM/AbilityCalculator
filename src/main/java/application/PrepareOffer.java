
package application;

import data.Offer;
import data.UserData;
import exceptions.NoAbilityException;
import implementation.MaxLoanPeriodCalculation;
import implementation.DataLoader;
import implementation.OffersPreparation;
import java.util.List;


import static data.ConstantData.MIN_LOAN_TERM;

public class PrepareOffer {
    private final DataLoader dataLoader = new DataLoader();

    private final MaxLoanPeriodCalculation maxLoanPeriodCalculation = new MaxLoanPeriodCalculation();

    private final OffersPreparation offersPreparation = new OffersPreparation();

    public void prepareOffer() {
        UserData userData = dataLoader.returnDataFromUser();

        int maxLoanPeriod = maxLoanPeriodCalculation.calculateMaxLoanPeriod(userData.getEmploymentPeriod());

        try {
            checkLoanPeriod(maxLoanPeriod);
        } catch (NoAbilityException exception) {

            System.out.println(exception.getMessage());
            System.exit(1);
        }

        List<Offer> offers = offersPreparation.prepareOffers(maxLoanPeriod, userData);

        System.out.println("Below are the details of your offer: \n");
        printOffers(offers);

    }
    private void checkLoanPeriod(int maxLoanPeriod) throws NoAbilityException {
        if (maxLoanPeriod < MIN_LOAN_TERM) {
            throw new NoAbilityException("Sorry, we have no offer for you, you have no available credit capacity");
        }
    }
    private void printOffers(List<Offer> offers) {
        for (Offer offer : offers) {
            System.out.println(offer);
        }
    }
}