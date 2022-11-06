package implementation;

import exceptions.NoAbilityException;

import static data.ConstantData.MIN_LOAN_AMOUNT;

public class LoanAmountChecker {
    public void checkMaxLoanAmount(double maxLoanAmount) throws NoAbilityException {
        if (maxLoanAmount < MIN_LOAN_AMOUNT) {
            throw new NoAbilityException("Sorry, we have no offer for you, you have no available credit capacity");
        }
    }
}
